pipeline {
    agent any
    environment {
     BRANCH_NAME =  "${GIT_BRANCH.split('/').size() > 1 ? GIT_BRANCH.split('/')[1..-1].join('/') : GIT_BRANCH}"
  }
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
                    echo ${env.GIT_BRANCH}
                '''
                script{
                    bat "echo ${env.BRANCH_NAME}"
                }
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
                getBranch()
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

def getBranch(){
    def env = System.getenv()
    env.each{
        println it
    } 
}
