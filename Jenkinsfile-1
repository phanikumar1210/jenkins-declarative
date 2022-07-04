pipeline {
    agent any
    stages {
        stage('First stage'){
            steps {
                bat '''
                    echo "pipeline is successful"
                '''
            }
        }
        stage('second stage'){
            steps {
                bat '''
                    %WORKSPACE%/sample.bat
                '''
            }
        }
    }
}