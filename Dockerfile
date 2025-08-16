# Tomcat base image
FROM tomcat:9.0

# Default ROOT app delete kar dete hain
RUN rm -rf /usr/local/tomcat/webapps/ROOT

# Apna Interest.war copy karke ROOT.war bana dete hain
COPY Interest.war /usr/local/tomcat/webapps/ROOT.war

# Tomcat port
EXPOSE 8080

# Tomcat start command
CMD ["catalina.sh", "run"]
# Tomcat base image use karo
FROM tomcat:9.0

# WAR file ko Tomcat ke webapps me copy karo
COPY Interest.war /usr/local/tomcat/webapps/ROOT.war


# Tomcat port expose karo
EXPOSE 8080

# Tomcat start command
CMD ["catalina.sh", "run"]


