node{
    stage("Hello World"){
        this is git pr testing "Welcome"
        this is git pr testing "${env.BRANCH_NAME}"
    }
    stage("Stage 2"){
        this is git pr testing "Stage 2"
    }
}
