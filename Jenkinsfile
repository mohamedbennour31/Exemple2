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
            -Dsonar.login=VOTRE_TOKEN \
            -Dsonar.host.url=http://192.168.204.130:9000 \
            -Dsonar.tests="
    }
}
    }
}
