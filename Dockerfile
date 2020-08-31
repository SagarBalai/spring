FROM maven:3.6.0-jdk-8
COPY azure-demo /app
WORKDIR /app
EXPOSE 8090
RUN mvn install -DskipTests
ENTRYPOINT java -jar target/azure-*.jar

