import hudson.slaves.EnvironmentVariablesNodeProperty
instance = Jenkins.getInstance()
globalNodeProperties = instance.getGlobalNodeProperties()
envVarsNodePropertyList = globalNodeProperties.getAll(EnvironmentVariablesNodeProperty.class)

newEnvVarsNodeProperty = null
envVars = null

if ( envVarsNodePropertyList == null || envVarsNodePropertyList.size() == 0 ) {
  newEnvVarsNodeProperty = new EnvironmentVariablesNodeProperty();
  globalNodeProperties.add(newEnvVarsNodeProperty)
  envVars = newEnvVarsNodeProperty.getEnvVars()
} else {
  envVars = envVarsNodePropertyList.get(0).getEnvVars()
}

def datenow = sh returnStdout: true, script: 'date +%d-%m-%Y'
envVars.put("RELEASE_BRANCH6", "${datenow}")

instance.save()


def printWedonlydate() {
def date = sh returnStdout: true, script: 'date +%d-%m-%Y'
Calendar cal = Calendar.getInstance();
int day = cal.get(Calendar.DAY_OF_WEEK);

    if (day == 4){
        RELEASE_BRANCH1 = "release-" + date
    }else{
      //  RELEASE_BRANCH1 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
        RELEASE_BRANCH6 = "release-" + RELEASE_BRANCH6
       print RELEASE_BRANCH6
        
    }
}
