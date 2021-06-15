pipeline {
  agent { docker { image 'maven:3.3.3' } }
  stages {
    stage('build') {
      steps {
          sh 'echo Made it to steps'
          sh 'mvn compiler:compile -f ./pom.xml'
      }
    }
  }
}
