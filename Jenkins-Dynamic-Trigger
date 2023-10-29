pipeline {
    agent any
    triggers {
        cron('* * * * *')
    }
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
