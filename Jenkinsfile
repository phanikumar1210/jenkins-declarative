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
        stage('When stage'){
            when {
                 expression { "${params.Env}" == 'Yes' }
            }
            steps {
                
                bat '''
                        echo "In when condition"
                '''
            }
        }
        /* We can't have if directly inside steps in declarative pipeline. We need to have script section to have if/When condition */
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