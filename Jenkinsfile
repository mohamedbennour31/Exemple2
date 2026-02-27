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
                
                sh 'mvn sonar:sonar -Dsonar.login=f5f07a3209ce48aba82c76e0bd8961a257e42e4c'
            }
        }
    }
}