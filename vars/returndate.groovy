def printWedonlydate() {
//sh "DATE=`date +%d-%m-%Y`"
def date = sh returnStdout: true, script: 'date +%d-%m-%Y'
def newdate = sh returnStdout: true, script: 'date -d "+7 days" +%m-%d-%Y'
def  dayofweek1 = sh returnStdout: true, script: 'date +"%u"'
// echo date
// echo newdate
 echo dayofweek1



if((dayofweek1 == 6) or (dayofweek1 ==7)){ return 'Yes' }else{ return 'No' }

// if ( dayofweek ) {
 // print date
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
