FROM maven:3.9.3-amazoncorretto-20 as builder

COPY ./ /var/www
RUN mvn -f /var/www/pom.xml clean package

FROM amazoncorretto:20-alpine-jdk

COPY --from=builder /var/www/target/forum-1.jar /usr/local/lib/forum.jar

ENTRYPOINT ["java","-jar","/usr/local/lib/forum.jar"]

