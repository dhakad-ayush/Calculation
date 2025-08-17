FROM tomcat:11.0

# Default webapps hatao
RUN rm -rf /usr/local/tomcat/webapps/*

# Apni WAR ko ROOT.war ke naam se deploy karo
COPY target/Interest.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
