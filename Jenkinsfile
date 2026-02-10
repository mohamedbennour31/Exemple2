pipeline{
    agent any
    stages{
        stage('Checkout Git'){
            steps{
                echo 'Pulling ...';
                git branch: 'master',
                url :'https://github.com/mohamedbennour31/Exemple2';
            }
        }
         stages{
        stage('Testing maven'){
            steps{
               sh 'mvn -version'
            }
        }
    }
    }
}