FROM openjdk:8
ADD target/basic-rest-api-0.0.1-SNAPSHOT.jar /usr/run/basic-rest-api-0.0.1-SNAPSHOT.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","/usr/run/basic-rest-api-0.0.1-SNAPSHOT.jar"]