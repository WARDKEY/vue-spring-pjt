
# Jenkins
#FROM openjdk:17-alpine
#
## jar파일을 만들고
#ARG JAR_FILE=build/libs/*.jar
#
## jar파일을 copy, jar는 자바의 실행 파일
#COPY ${JAR_FILE} backend.jar
#
## jar파일 실행할 때 사용
#ENTRYPOINT ["java","-jar","/backend.jar"]


# git action
FROM openjdk:17-alpine

# 컨테이너 상의 파일
#WORKDIR /app-backend

# 컨테이너 상의 jar 파일 생성
ARG JAR_FILE=build/libs/*.jar

# 만들어지는 jar의 이름
COPY ${JAR_FILE} vuespring.jar

# jar 파일 실행
ENTRYPOINT ["java","-jar","/vuespring.jar"]