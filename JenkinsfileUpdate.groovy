node{
    stage("Pull Repo") {
        git  "git@github.com:farrukh90/packerde.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}