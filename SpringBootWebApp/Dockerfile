FROM java:8-jdk-alpine
ARG JAR_FILE=target/SpringBootDemo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /usr/app/app.jar
ENTRYPOINT ["java", "-jar", "/usr/app/app.jar"]
