FROM tomcat:9.0
ADD target/kdbms_web.war /usr/local/tomcat/webapps/
EXPOSE 8080
