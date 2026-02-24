pipeline {
    agent any 
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/AnupDudhe/studentapp-ui.git'
            }
        }
        stage('Build') { 
            steps {
               sh 'echo "this is build stage"'
            }
        }
        stage('Test') { 
            steps {
                sh 'echo "this is test stage"'
            }
        }
        stage('Deploy') { 
            steps {
                sh 'echo "this is deploy stage"'
            }
        }
    }
    }


    #change branch in jenkins that is write in github