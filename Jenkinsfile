pipeline 
{
    agent none

    stages 
    {
        stage('Frontend') {
            agent{
                docker {
                    image 'gayatri491/frontend_app3:latest'
                }
            }
            steps 
            {
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
                sh 'docker ps'
        }
            }
             }
    }
    
