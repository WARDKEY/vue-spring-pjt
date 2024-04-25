FROM openjdk:17-alpine

# jar파일을 만들고
ARG JAR_FILE=build/libs/*.jar

# jar파일을 copy, jar는 자바의 실행 파일
COPY ${JAR_FILE} backend.jar

# jar파일 실행할 때 사용
ENTRYPOINT ["java","-jar","/backend.jar"]
