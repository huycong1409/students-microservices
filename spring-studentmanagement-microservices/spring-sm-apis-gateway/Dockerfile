FROM openjdk:8-jre
VOLUME /tmp
#EXPOSE 9001
ADD target/spring-sm-api-gateway-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
