# Tomcat 9 base image use karo
FROM tomcat:9.0

# Tomcat ke default apps delete karo (ROOT bhi)
RUN rm -rf /usr/local/tomcat/webapps/*

# Apni WAR file copy karo aur ROOT.war naam de do
COPY target/Interest.war /usr/local/tomcat/webapps/ROOT.war

# Port expose karo
EXPOSE 8080

# Tomcat start karo
CMD ["catalina.sh", "run"]
