pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'mvn clean package'
        echo 'Compiled Success'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing is to be done here'
      }
    }
    stage('Deploye') {
      steps {
        echo 'WAR Deployed MSG'
      }
    }
  }
  environment {
    JAVA_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_144'
    MAVEN_HOME = 'D:\\apache-maven-3.5.3'
  }
}