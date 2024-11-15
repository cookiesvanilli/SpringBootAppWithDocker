FROM openjdk:17-jdk

EXPOSE 8081

ADD target/SpringBootApp-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java","-jar","/myapp.jar"]