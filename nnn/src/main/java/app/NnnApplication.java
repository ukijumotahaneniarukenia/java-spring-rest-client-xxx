package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class NnnApplication {

	private static final String VALID_URL = "^(https?|ftp)(://[-_.!~*'()a-zA-Z0-9;/?:@&=+$,%#]+)";

	private static final String API_SERVER_ENTRY_URL = "https://gturnquist-quoters.cfapps.io/api/random";

	private static final List<String> INCLUDE_MUST_ENTRY_URL_LIST = new LinkedList(){{
		add(API_SERVER_ENTRY_URL);
	}};

	private static final List<String> INCLUDE_OPTIONAL_ENTRY_URL_LIST = new LinkedList(){{

	}};

	private static final List<String> EXCLUDE_MUST_ENTRY_URL_LIST = new LinkedList(){{

	}};

	private static final List<String> EXCLUDE_OPTIONAL_ENTRY_URL_LIST = new LinkedList(){{

	}};

	private static final Set<String> ENTRY_URL_LIST = new LinkedHashSet<>(){{
		addAll(INCLUDE_MUST_ENTRY_URL_LIST);
		addAll(INCLUDE_OPTIONAL_ENTRY_URL_LIST);
	}};

	private static boolean excludeMustEntryUrlList(String targetUrl){
		return EXCLUDE_MUST_ENTRY_URL_LIST.stream().noneMatch(excludeUrl -> excludeUrl.equals(targetUrl));
	}

	private static boolean excludeOptionalEntryUrlList(String targetUrl){
		return EXCLUDE_OPTIONAL_ENTRY_URL_LIST.stream().noneMatch(excludeUrl -> excludeUrl.equals(targetUrl));
	}

	public static String accessEntryUrl (String entryUrl) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject(entryUrl, Quote.class);
		return quote.toString();
	}

	private static boolean isValidUrl(String url){

		Pattern pattern = Pattern.compile(VALID_URL);

		Matcher matcher = pattern.matcher(url);

		if(matcher.matches()){
			return true;
		}else{
			return false;
		}

	}

	public static void main(String... args) {
		SpringApplication.run(NnnApplication.class, args);
		Arrays.asList(args).stream().forEach(url->{

			if(isValidUrl(url)){
				ENTRY_URL_LIST.add(url);
			}
		});

		ENTRY_URL_LIST.stream()
				.filter(entryUrl->excludeMustEntryUrlList(entryUrl))
				.filter(entryUrl->excludeOptionalEntryUrlList(entryUrl))
				.forEach(entryUrl -> {
					System.out.println(entryUrl);
					System.out.println(accessEntryUrl(entryUrl));
				});
	}
}
