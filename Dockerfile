FROM openjdk:17

ARG JAVA_FILE=target/*.jar

COPY ${JAVA_FILE} api-gateway.jar

ENTRYPOINT ["java", "-jar", "/api-gateway.jar"]

EXPOSE 9090
