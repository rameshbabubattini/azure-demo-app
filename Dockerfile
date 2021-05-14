FROM openjdk:8u292-jdk
COPY target/azure-demo-app*.jar azure-demo-app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "azure-demo-app.jar"]