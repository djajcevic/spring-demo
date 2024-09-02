FROM eclipse-temurin:22.0.2_9-jdk AS build
COPY . .
RUN ./mvnw clean package -DfinalName=app -P ci

FROM eclipse-temurin:22.0.2_9-jdk AS runtime
COPY --from=build target/app.jar ./app.jar

ENTRYPOINT ["java", "-jar", "./app.jar"]