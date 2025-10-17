pipeline 
{
    agent none

    stages 
    {
        stage('Frontend') {
            agent{
                docker {
                    image 'gayatri491/frontend_app3:latest'
                    args '-u root:root -v /var/run/docker.sock:/var/run/docker.sock'
                }
            }
            steps 
            {
                sh 'apt-get update && apt-get install -y docker.io'
                sh 'docker ps'
                }
            }
        
        stage('Backend') {
            agent{
                docker {
                    image 'gayatri491/backend_app2:latest'
                }
            }
            steps 
            {
                sh 'apt-get update && apt-get install -y docker.io'
                sh 'docker ps'
        }
            }
             }
    }
    
