# First stage: Build the application with OpenJDK and Maven installed manually
FROM eclipse-temurin:17-jdk-focal AS builder

# Install Maven using apt-get (Alpine is not used in this case)
RUN apt-get update && apt-get install -y maven

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project (including Maven wrapper files and pom.xml)
COPY . .

# Run Maven to resolve dependencies offline
RUN ./mvnw dependency:go-offline

# Expose port 8080 for Spring Boot
EXPOSE 8080

# Run the Spring Boot application
CMD ["./mvnw", "spring-boot:run"]
