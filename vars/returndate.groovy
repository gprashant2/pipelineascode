def printWedonlydate() {
sh "DATE=`date +%d-%m-%Y`"
sh "NEW_DATE=$(date -d "+7 days" '+%m-%d-%Y')"
sh "DAYOFWEEK=$(date +"%u")"
sh "if [ "$DAYOFWEEK" == 3 ];  then    echo $DATE; else    echo $NEW_DATE; fi"
}
