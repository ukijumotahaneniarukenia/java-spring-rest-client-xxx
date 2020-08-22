# java-spring-rest-client-xxx


使い方

```
$ java -jar /home/aine/java-spring-rest-client-xxx/nnn/target/nnn-0.0.1-SNAPSHOT.jar ああああ https://gturnquist-quoters.cfapps.io/api/random https://cat-fact.herokuapp.com/facts

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.3.RELEASE)

2020-08-22 05:25:43.758  INFO 79007 --- [           main] app.NnnApplication                       : Starting NnnApplication v0.0.1-SNAPSHOT on doc-ubuntu-20-04-vim with PID 79007 (/home/aine/java-spring-rest-client-xxx/nnn/target/nnn-0.0.1-SNAPSHOT.jar started by aine in /home/aine/java-spring-rest-client-xxx)
2020-08-22 05:25:43.760  INFO 79007 --- [           main] app.NnnApplication                       : No active profile set, falling back to default profiles: default
2020-08-22 05:25:44.196  INFO 79007 --- [           main] app.NnnApplication                       : Started NnnApplication in 0.681 seconds (JVM running for 0.941)
https://gturnquist-quoters.cfapps.io/api/random
{type:"success",value:{id:4,quote:"Previous to Spring Boot, I remember XML hell, confusing set up, and many hours of frustration."}}
https://cat-fact.herokuapp.com/facts
{type:"null",value:null}

$ cp /home/aine/java-spring-rest-client-xxx/nnn/target/nnn-0.0.1-SNAPSHOT.jar $HOME/

$ cd $HOME

ポータブル

$ java -jar nnn-0.0.1-SNAPSHOT.jar 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.3.RELEASE)

2020-08-22 05:26:31.776  INFO 79049 --- [           main] app.NnnApplication                       : Starting NnnApplication v0.0.1-SNAPSHOT on doc-ubuntu-20-04-vim with PID 79049 (/home/aine/nnn-0.0.1-SNAPSHOT.jar started by aine in /home/aine)
2020-08-22 05:26:31.778  INFO 79049 --- [           main] app.NnnApplication                       : No active profile set, falling back to default profiles: default
2020-08-22 05:26:32.220  INFO 79049 --- [           main] app.NnnApplication                       : Started NnnApplication in 0.68 seconds (JVM running for 0.944)
https://gturnquist-quoters.cfapps.io/api/random
{type:"success",value:{id:5,quote:"Spring Boot solves this problem. It gets rid of XML and wires up common components for me, so I don't have to spend hours scratching my head just to figure out how it's all pieced together."}}

```
