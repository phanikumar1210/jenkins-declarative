node{
    stage("Hello World"){
        echo "Welcome"
        echo "${env.BRANCH_NAME}"
    }
    stage("Stage 2"){
        echo "Stage 2"
    }
}
