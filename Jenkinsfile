pipeline {
    agent any
     parameters {
    choice(
        name: 'Env',
        choices: ["Yes","No"],
        description: 'Validating whether to proceed or not' )
  }
    stages {
        stage('First stage'){
            steps {
                bat '''
                    echo "pipeline is successful"
                '''
            }
        }
        stage('If stage'){
            steps {
                script{
                    if ( "${params.Env}"  == "Yes" ){
                            bat '''
                            echo "In when condition"
                        '''
                        }
                }
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