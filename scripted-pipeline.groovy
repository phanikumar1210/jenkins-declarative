node{
    stage("Hello World"){
        echo "Welcome"
        echo "${env.GIT_BRANCH}"
    }
    stage("Stage 2"){
        echo "Stage 2"
    }
}
