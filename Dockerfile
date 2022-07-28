FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/helloworldapp-0.0.1-SNAPSHOT.jar helloworldapp.jar
ENTRYPOINT ["java","-jar","/helloworldapp.jar"]