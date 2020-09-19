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
    stages{
        stage('Build'){
            steps {
                bat 'mvn clean package'
            }
            post {
                success {
                    echo '存檔'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
    }
}