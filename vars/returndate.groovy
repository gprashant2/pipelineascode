def printWedonlydate() {
def date = sh returnStdout: true, script: 'date +%d-%m-%Y'
Calendar cal = Calendar.getInstance();
int day = cal.get(Calendar.DAY_OF_WEEK);
def  RELEASE_BRANCH3 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
    if (day == 4){
        print date
    }else{
        RELEASE_BRANCH1 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
        RELEASE_BRANCH1 = "release-" + RELEASE_BRANCH1
        print RELEASE_BRANCH1
    }
                        }
