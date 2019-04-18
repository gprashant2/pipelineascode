def printWedonlydate() {
DATE=`date +%d-%m-%Y`
NEW_DATE=$(date -d "+7 days" '+%m-%d-%Y')
DAYOFWEEK=$(date +"%u")
sh "if [ "$DAYOFWEEK" == 3 ];  then    echo $DATE; else    echo $NEW_DATE; fi"
}
