def printWedonlydate() {
//sh "DATE=`date +%d-%m-%Y`"
def date = sh returnStdout: true, script: 'date +%d-%m-%Y'
Calendar cal = Calendar.getInstance();
int day = cal.get(Calendar.DAY_OF_WEEK);
    def  RELEASE_BRANCH3 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
if (day == 4){
    print date
}else{
    def  RELEASE_BRANCH1 = sh returnStdout: true, script: 'date -d "next wednesday" +%d-%m-%Y'
  //  print nextwed
    // def RELEASE_BRANCH = nextwed
    
    println RELEASE_BRANCH1
   
    
   // println("release-" + RELEASE_BRANCH);
    
   // echo "INFO: ${message}"
}




 //if ( dayweek.equals('Thu' )) {
  //print date
 //}
//def output = sh returnStdout: true, script: 'if [ "dayofweek" == 3 ];  then    echo date; else echo newdate; fi' 
 // sh "if [ "dayofweek" == 4 ];  then    echo date;  fi"
//def output = sh returnStdout: true, script: 'if [ "$dayofweek" == 3 ];  then    echo $date; else    echo $new_date; fi'
//def date = new Date().format("MM-dd-YYYY")
//print date 
//print newdate  
//print dayofweek
//NEW_DATE=$(date -d "+7 days" '+%m-%d-%Y')
//DAYOFWEEK=$(date +"%u")
//sh "if [ "$DAYOFWEEK" == 3 ];  then    echo $DATE; else    echo $NEW_DATE; fi"
}
