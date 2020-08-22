package app;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import static app.JsonSign.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long id;
    private String quote;

    public Value() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return LEFT_CURLY_BRACKET +
                        "id" + COLON + id +
                COMMA + "quote" + COLON + DOUBLE_QUOTATION_MARK + quote + DOUBLE_QUOTATION_MARK +
                RIGHT_CURLY_BRACKET ;
    }
}