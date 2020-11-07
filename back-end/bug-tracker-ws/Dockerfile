# we are extending everything from tomcat:9.0 image ...

FROM tomcat:jdk8

# Move .dist to webapps
#  RUN mv /usr/local/tomcat/webapps/ /usr/local/tomcat/webappstemp/
#  RUN mv /usr/local/tomcat/webapps.dist/ /usr/local/tomcat/webapps/

# COPY my war to  docker-tomcat
COPY target/bug-tracker-ws-0.1.war /usr/local/tomcat/webapps/

# Update users and auth manager
COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY context.xml /usr/local/tomcat/webapps/manager/META-INF/
COPY context.xml /usr/local/tomcat/webapps/host-manager/META-INF/

CMD ["catalina.sh","run"]