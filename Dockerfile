FROM tomcat:8.0-alpine
ADD target/kdbms_web.war /usr/local/tomcat/webapps/
CMD["catalina.sh", "run"]
EXPOSE 8080
