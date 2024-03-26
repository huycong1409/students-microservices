FROM openjdk:8u332-jre
VOLUME /tmp
#EXPOSE 9001
ADD target/spring-sm-config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
