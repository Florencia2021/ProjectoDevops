pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Check out the code from version control
                  git branch: 'main', url: 'https://github.com/Florencia2021/ProjectoDevops.git'// Replace with your repository URL
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image using the Dockerfile in the repository
                    def app = docker.build("devops-app:latest", "-f Dockerfile .")
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    // Stop any running containers from previous builds
                    sh 'docker stop devops-app || true && docker rm devops-app || true'
                    
                    // Run the Docker container
                    app.run("-p 8081:8080 --name devops-app")
                }
            }
        }
    }
}

