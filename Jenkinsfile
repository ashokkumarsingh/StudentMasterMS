pipeline {
  agent any
  stages {
    stage('BUILD') {
      steps {
        bat 'mv clean package'
      }
    }
  }
  environment {
    JAVA_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_144'
    MAVEN_HOME = 'D:\\apache-maven-3.5.3'
  }
}