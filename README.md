decProject
==========

class project


----Steps to run project, H2 database and open Agile Database------

1) Update Eclipse for latest jboss tools using the update site

jboss - http://download.jboss.org/jbosstools/updates/stable/juno

2) Import the AgileAnalyzer project to eclipse.

3) Clear server runtime errors. (Point the server location to the wildfly server pulled from GIT)

4) place Agile.h2.db in a folder and change the location in persistence.xml in the AgileAnalyzer project to that location.

5) unzip the h2 database zip h2-2013-05-25.zip and place it in a location of your convenience. 

6) run h2.bat to start the database.

7) point the jdbc url to the Agile.h2.db saved in your system. 

8) test drive the console.

9) Try running the BasicDAO class in the project to test if the connection is working.

10) Do not run BasicDAO if ur connected to the database via console.






