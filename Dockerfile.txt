# Tomcat base image use karo
FROM tomcat:9.0

# WAR file ko Tomcat ke webapps me copy karo
COPY target/Calculation.war /usr/local/tomcat/webapps/Calculation.war

# Tomcat port expose karo
EXPOSE 8080

# Tomcat start command
CMD ["catalina.sh", "run"]
