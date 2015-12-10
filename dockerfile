  FROM java:8
	VOLUME /tmp
	ADD target/test.jar  springboot.jar
	RUN bash -c 'touch springboot.jar'
	ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","springboot.jar"]
