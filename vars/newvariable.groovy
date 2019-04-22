def printWedonlydate() {
import hudson.EnvVars
import hudson.model.Environment

def build = Thread.currentThread().executable
def  RELEASE_BRANCH1 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
  def vars = [ENV_VAR1: '${RELEASE_BRANCH2}']

build.environments.add(0, Environment.create(new EnvVars(vars)))
def date = sh returnStdout: true, script: 'date +%d-%m-%Y'
Calendar cal = Calendar.getInstance();
int day = cal.get(Calendar.DAY_OF_WEEK);
//if (day == 4){
  //  print date
//}else{
  //  def  nextwed = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'

//}

}
