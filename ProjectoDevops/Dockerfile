# Start with the official Tomcat image
FROM tomcat:9.0
	
WORKDIR /opt/apache-tomcat-9.0.97

# Copy the WAR file to the Tomcat webapps directory
COPY ProjectoDevops.war /usr/local/tomcat/webapps/ProjectoDevops.war 

# Expose the default Tomcat port
EXPOSE 8082

# Start Tomcat
CMD ["catalina.sh", "run"]

