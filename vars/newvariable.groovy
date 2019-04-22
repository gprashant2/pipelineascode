
import hudson.EnvVars
import hudson.model.Environment

def build = Thread.currentThread().executable
def  RELEASE_BRANCH1 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
  def vars = [RELEASE_BRANCH2: '${RELEASE_BRANCH1}']

build.environments.add(0, Environment.create(new EnvVars(vars)))



