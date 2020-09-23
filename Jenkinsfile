pipeline{
    agent any
    stages{
        stage('Build Backend'){
            steps{
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage('Run Unit tests'){
            steps{
                bat 'mvn test'
            }
        }
         stage('Sonar Analysis'){
             environment{
                 sonnarHome = tool 'SONAR_SCANNER'
             }
            steps{
                withSonnarQubeEnv('SONAR_LOCAL'){
                    bat "${sonnarHome}/bin/sonar-scanner -e -Dsonar.projectKey=DeployBack -Dsonar.host.url=http://localhost:9000 -Dsonar.login=e0d623a62889546174d34ef9d6239a4edf046c91 -Dsonar.java.binaries=target -Dsonar.coverage.exclusions=**/.mvn/**, **/src/test/**, **/model/**, **Application.java"
                }                
            }
        }
    }
}