FROM openjdk:8u342-jre
VOLUME /tmp
#EXPOSE 9001
ADD target/spring-cloud-hystrix-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
