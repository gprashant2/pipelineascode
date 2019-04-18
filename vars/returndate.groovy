def printWedonlydate() {
def DATE= sh "`date +%d-%m-%Y`"
def date = sh returnStdout: true, script: 'date +%d-%m-%Y'
print date  
//NEW_DATE=$(date -d "+7 days" '+%m-%d-%Y')
//DAYOFWEEK=$(date +"%u")
//sh "if [ "$DAYOFWEEK" == 3 ];  then    echo $DATE; else    echo $NEW_DATE; fi"
}
