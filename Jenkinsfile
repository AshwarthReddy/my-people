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
                    withSonarQubeEnv(credentialsId: 'sonar-token') {
                      sh 'chmod +x gradlew'
                      sh './gradlew sonarqube -Dsonar.analysis.mode=preview'
                    }

                }
            }
            
        }
    }
    
}