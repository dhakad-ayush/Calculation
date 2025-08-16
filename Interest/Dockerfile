FROM tomcat:9.0

# Tomcat ke default apps delete karo
RUN rm -rf /usr/local/tomcat/webapps/*

# Apni WAR file copy karo aur ROOT.war naam de do
COPY target/Interest.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
