FROM openjdk:8-jre-alpine
RUN apk add --update \
    curl \
    && rm -rf /var/cache/apk/*
ARG JAR_FILE=target/SpringBootDemo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /usr/app/app.jar
CMD java -jar -Dspring.profiles.active=prod /usr/app/app.jar
