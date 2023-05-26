public class func{
public void openConnection(){
        Class.forName(drvSettings.getClassName());
        openedConnection = DriverManager.getConnection(drvSettings.getJDBCUrl(), drvSettings.
            getAccessLogin(), drvSettings.getAccessPasswd());
}
}
