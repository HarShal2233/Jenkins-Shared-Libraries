def call(String Project,String ImageTag, String dockerhubuser) {
  withCredentials([usernamePassword('credentialsId':"DockerHubCredentials",passwordVariable:"DockerHubPass",usernameVariable:"DockerHubUser")])
  {
                sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
