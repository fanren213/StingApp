#README

Bonan Cao <bonanc@andrew.cmu.edu>
Nov. 12. 2015
This directory holds the the Android project for Mini 2 Assignment 3 Part B of 18-641, the class diagram and the outputs of project. This is an app used for marketing of Sting. The details are as follows.

There are two packages in the project:
UI: the UI of the project including one activity and five fragments for different functions including the display of information, playing video and audio, showing image and sending message or email;
Util: the operation of database;

Test:
Import the project into the Android Studio and use the emulator to run the StingApp. Main Page is displayed. Click video and select one video to play. Click audio and select one song to play. Click wallpaper and select one wallpaper to display. Click add to mail list and fill the first name, last name and email address, click submit. We will send a message and save the info in the database. If one blank is not fill, there will be an alert dialog. The exception will be recorded in the log. 

Test outputs:
test_output_1.png: main page.
test_output_2.png: video.
test_output_3.png: audio.
test_output_4.png: wallpaper.
test_output_5.png: add to mail list.
test_output_6.png: exception when filling in the blanks.
The diagram is shown in class_diagram_part_B.png.
The signed APK: app-release.apk.

The file list:
        ▾ Part B/
          ▾ StingApp/
            ▾ app/
              ▸ build/
              ▸ libs/
              ▾ src/
                ▸ androidTest/
                ▾ main/
                  ▾ java/
                    ▾ bonanc/
                      ▾ stingapp/
                        ▾ ui/
                            AudioFragment.java
                            MailFragment.java
                            MainActivity.java
                            MainFragment.java
                            VideoFragment.java
                            WallpaperFragment.java
                        ▾ util/
                            DatabaseOps.java
                  ▾ res/
                    ▾ drawable/
                        portrait.jpg
                        wallpaper1.jpg
                        wallpaper2.jpg
                        wallpaper3.jpg
                    ▸ layout/
                    ▸ menu/
                    ▸ mipmap-hdpi/
                    ▸ mipmap-mdpi/
                    ▸ mipmap-xhdpi/
                    ▸ mipmap-xxhdpi/
                    ▾ raw/
                        a_thousand_years.mp3
                        every_breath_you_take.mp3
                        shape_of_my_heart.mp3
                        video1.mp4
                        video2.mp4
                        video3.mp4
                    ▸ values-v21/
                    ▸ values-w820dp/
                    ▸ values/
                    AndroidManifest.xml
                app.iml
                build.gradle
                proguard-rules.pro
            ▸ build/
            ▸ gradle/
              build.gradle
              gradle.properties
              gradlew*
              gradlew.bat
              local.properties
              settings.gradle
              StingApp.iml
            app-release.apk
            class_diagram_part_B.png
            readme.txt
            test_output_1.png
            test_output_2.png
            test_output_3.png
            test_output_4.png
            test_output_5.png
            test_output_6.png