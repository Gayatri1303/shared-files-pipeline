def run():
  echo "deployment stage"
  sh "sudo docker pull gayatri491/frontend_app3:latest"
  sh "sudo docker run -d -p 80:80  gayatri491/frontend_app3:latest"
