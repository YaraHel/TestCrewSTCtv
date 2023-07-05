tools {
    maven 'M3'
}
pipeline {
    agent any
    stages {
        stage('Run Tests') {
            steps {
                sh '.mvn clean test'
            }
        }
    }
}