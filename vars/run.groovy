def run(image_name){
  echo "deployment stage"
  sh "sudo docker pull $image_name"
  sh "sudo docker run -d -p 80:80  gayatri491/frontend_app3:latest"
}
