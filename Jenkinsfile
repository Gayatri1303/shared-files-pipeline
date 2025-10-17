pipeline {
    agent none

    stages {
        stage('Frontend') {
            agent {
                docker {
                    image 'gayatri491/frontend_app3:latest'
                    args '-v /var/run/docker.sock:/var/run/docker.sock -u root:root'
                }
            }
            steps {
                sh 'docker ps'
            }
        }

        stage('Backend') {
            agent {
                docker {
                    image 'gayatri491/backend_app2:latest'
                    args '-v /var/run/docker.sock:/var/run/docker.sock -u root:root'
                }
            }
            steps {
                sh 'docker ps'
            }
        }
    }
}
