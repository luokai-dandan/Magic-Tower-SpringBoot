FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/mota-0.0.1-SNAPSHOT.jar mota-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mota-0.0.1-SNAPSHOT.jar", "&"]
