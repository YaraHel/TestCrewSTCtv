pipeline {
    agent any
    stages {
        stage('Run Tests') {
            steps {
                sh '.mvn clean test'
            }
            post {
                always {
                    junit '**/cucumber/report.json'
                }
            }
        }
    }
}