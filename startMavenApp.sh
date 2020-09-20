$ mvnw -f netflix-eureka-naming-server/pom.xml spring-boot:run &
$ mvnw -f netflix-zuul-api-gateway/pom.xml spring-boot:run &
$ mvnw -f spring-cloud-config-server/pom.xml spring-boot:run &
$ mvnw -f currency-exchange-service/target/pom.xml spring-boot:run &
$ mvnw -f currency-conversion-service/pom.xml spring-boot:run &
$ mvnw -f limits-service/pom.xml spring-boot:run &