pipeline {
    agent any

    tools {
        maven 'maven-3.99'
        jdk 'java-23'
    }

      stages {
        stage('checkout') {
            steps {
              git branch : 'master', url: 'https://github.com/NGomes1990/simple-java-maven-app.git'
            }
        }
    
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean verify'
            }
        }
        
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
    }
}
