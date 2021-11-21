pipeline{
    agent any
    stages{
        stage("Sonar Quality Check"){
            agent {
                docker {
                    image 'openjdk:17-alpine'
                }
            }
            steps{
                script{
                    withSonarQubeEnv(credentialsId: 'sonartoken') {
                      sh 'chmod +x gradlew'
                      sh './gradlew sonarqube'
                    }

                }
            }
            
        }
    }
    
}