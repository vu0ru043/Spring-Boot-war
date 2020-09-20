/*
pipeline {
    agent any
    stages {
        stage ("Init"){
			steps{
				echo "Start init";
			}   
        }
		stage ("Build"){
            steps{
				echo "Start Build";
			} 
        }
		stage ("Deploy"){
            steps{
				echo "Start Deploy";
			} 
        }
	}
}
*/

pipeline {
    agent any
    tools{
        jdk 'LOCAL_JDK'
    }
    stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
    }
    stage('Deploy-To-Staging'){
            steps {
                build job: 'Deploy-To-Staging'
            }
        }
}