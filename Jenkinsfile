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
        // L'argument -Dsonar.tests="" indique à Sonar de ne pas chercher de tests
        sh "mvn sonar:sonar \
            -Dsonar.login=9211a7a22b3629089649968983455ef7af24695b \
            -Dsonar.host.url=http://192.168.204.130:9000 \
            -Dsonar.tests="
    }
}
    }
}
