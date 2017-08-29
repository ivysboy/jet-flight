FROM java:8-jre
VOLUME /tmp
EXPOSE 8099

ENV APP_NAME=jet-flight
ENV JAR_PATH=/jet-flight.jar
ENV APP_ENV=dev

ADD target/jet-flight.jar $JAR_PATH
RUN sh -c 'touch /jet-flight.jar'
ENV JAVA_OPTS="-Djava.net.preferIPv4Stack=true"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Denv=$APP_ENV -Djava.security.egd=file:/dev/./urandom -jar /jet-flight.jar" ]
