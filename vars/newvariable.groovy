
def releasebranch() {
  //  echo "INFO: ${message}"
   RELEASE_BRANCH2 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
  return RELEASE_BRANCH2;
        
}



