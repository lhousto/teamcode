#!/bin/bash

PWD=$(pwd)

function pullLink {
  curl -L -# https://github.com/ftctechnh/ftc_app/archive/master.zip > $PWD/ftc_app.zip
  unzip $PWD/ftc_app.zip
  rm $PWD/ftc_app.zip
  rm -r $PWD/ftc_app-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode
  ln -s $PWD/teamcode $PWD/ftc_app-master/TeamCode/src/main/java/org/firstinspires/ftc/teamcode
}

if [ ! -d $PWD/ftc_app-master ]
  then pullLink  
  else echo -n "ftc_app-master already exists, would you like to redownload it? (y/n): "
       read ui
       if [ $ui = "y" -o $ui = "Y" ]
         then rm -r $PWD/ftc_app-master
              pullLink
       fi
fi