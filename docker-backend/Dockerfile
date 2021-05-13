FROM openjdk:11.0.9.1-slim

ARG JAR_FILE=/target/docker-backend-0.0.1-SNAPSHOT.jar

WORKDIR /app/
ADD ${JAR_FILE} /app/docker-backend-0.0.1-SNAPSHOT.jar

VOLUME /tmp/

EXPOSE 8090

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/docker-backend-0.0.1-SNAPSHOT.jar"]
