FROM tomcat:9.0

# Tomcat ke default apps hata do (ROOT page bhi hat jayega)
RUN rm -rf /usr/local/tomcat/webapps/*

# Apni app ko ROOT context par deploy karo
COPY target/Interest.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
Isse tera app base URL par hi chalega (context path /).
