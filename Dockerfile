FROM tomcat:8.0-alpine
ADD target/kdbms_web.war /usr/local/tomcat/webapps/
EXPOSE 8080
