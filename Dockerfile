FROM maven:3.6.3-openjdk-14-slim AS build
COPY src /company/company-back/src
copy pom.xml /company/company-back/
RUN mvn -f /company/company-back/pom.xml clean package

FROM openjdk:14-alpine
COPY --from=build "company/company-back/target/company-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8089
ENTRYPOINT ["java","-jar","app.jar"]