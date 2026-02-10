pipeline {
    agent any 

    stages { // <--- This is the ONLY top-level stages block
        stage('Build') { 
            steps { 
                sh 'echo "Building..."'
            }
        }
        stage('Test') {
            steps {
                sh 'echo "Testing..."'
            }
        }
    } // <--- Close stages
} // <--- Close pipeline