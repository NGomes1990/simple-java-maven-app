pipeline {
    agent any

    tools {
        maven 'maven-3.99'  // Changed to match exact case from your Jenkins configuration
        jdk 'java-23'      // Verify this JDK version exists in your Jenkins configuration
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/NGomes1990/simple-java-maven-app.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'  // Changed from 'sh' to 'bat' for Windows
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvn test'  // Changed from 'sh' to 'bat' for Windows
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }

        stage('deliver') {
            steps {
                bat './jenkins/scripts/deliver.sh
            }

            }
        }
    }
}

