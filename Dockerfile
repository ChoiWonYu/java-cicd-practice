FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENV SPRING_PROFILES_ACTIVE=dev

ENTRYPOINT ["java", "-jar", "/app.jar"]

CMD ["--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
