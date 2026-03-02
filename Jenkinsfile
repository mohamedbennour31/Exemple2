pipeline {
    agent any

    stages {
        stage('Checkout GIT') {
            steps {
                echo 'Pulling...'
                git branch: 'master', 
                    url: 'https://github.com/mohamedbennour31/Exemple2.git'
            }
        }

        stage('Testing Maven') {
            steps {
                sh 'mvn -version'
            }
        }

        stage('MVN CLEAN') {
            steps {
                sh 'mvn clean'
            }
        }

        stage('MVN COMPILE') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('MVN SONARQUBE') {
            steps {
                
                sh 'mvn sonar:sonar -Dsonar.login=0f8c202e3b6b20e6f1072e2dea1b8f37efa2ac70'
            }
        }
    }
}