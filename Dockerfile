# Use official OpenJDK 17 image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy all project files into the image
COPY . .

# Build the project using Maven Wrapper
RUN ./mvnw clean install

# Run the built JAR
CMD ["java", "-jar", "target/Spring-0.0.1-SNAPSHOT.jar"]
