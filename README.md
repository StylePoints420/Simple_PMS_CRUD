# Simple_PMS_CRUD

A project that I made when I was a 2nd year college student.


# Prerequisites:
- [Netbeans IDE 15](https://netbeans.apache.org/download/nb15/index.html) (can also try the latest ver)
- [Xampp](https://www.apachefriends.org/download.html) (8.1 version under windows section)
- [MySQLConnector](https://dev.mysql.com/downloads/file/?id=515796) (for database)

# How to use this project:
# Xampp 
1. Open Xampp Control Panel (file name would be "xampp-control")
2. Under Actions, Start both Apache and MySQL and click the Admin button of MySQL or simply type "localhost/phpmyadmin" in your browser (double quotes not included)
3. Click 'New' located at the top left
4. The name of your database must be "wp_db" then click 'create' (double quotes not included)
5. Click the database, then select 'Import' located at the top > choose file > select "wp_db.sql" that you downloaded from here > scroll down and import
# Netbeans
1. Open Netbeans IDE
2. Download the whole 'LoginPage' folder > Click 'File' at the toolbar section at the top > Open project > select 'LoginPage' folder
3. After that, the project should be visible then right click 'Libraries' > Click 'Add JAR/Folder' > select the connector file named "mysql-connector-j-8.0.32.jar" 
4. Next, Look for the toolbar section at the top > select 'Window'
5. Right click Databases > New Connection > click Add > locate the connector file named "mysql-connector-j-8.0.32.jar" > tap Next 3 times > Finish
6. Right click Databases again > Click Admin Properties > After that, follow these steps: 
- Step 1:
Click browse on admin tool row > locate a "mysqladmin.exe" file under your Xampp file path > open
- Step 2:
Click browse on start command row > locate a "mysqld.exe" file under your Xampp file path> open >
- Step 3:
Repeat Step 1 but on stop command row this time > Write this in the 'arguments' under stop command row "-u root shutdown" (double quotes not included)
7. Go back to the 'LoginPage' folder > double click 'Source Packages' > click viewer > double click 'LoginPage_Layout.java' file > right click anywhere then select run file
8. Remember to leave xampp control panel open and both Apache and Mysql running when you did number 2 and the project should work fine.
