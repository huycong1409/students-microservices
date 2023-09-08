FROM openjdk:8u342-jre
VOLUME /tmp
EXPOSE 8761
ADD target/discovery-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
