pipeline {
    agent any
     environment {
        DOCKER_IMAGE = 'devops-app'
    }
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
		        sh 'docker build -t ${DOCKER_IMAGE} .'
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
		 sh '''
                    docker ps -q -f name=${DOCKER_IMAGE} && docker stop ${DOCKER_IMAGE} || true
                    docker ps -a -q -f name=${DOCKER_IMAGE} && docker rm ${DOCKER_IMAGE} || true
                    docker run -d --name ${DOCKER_IMAGE} ${DOCKER_IMAGE}
                    '''
                }
            }
        }
    }
}

