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
                    c://some/folder/run_build_windows.bat
                '''
            }
        }
    }
}