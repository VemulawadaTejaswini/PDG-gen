//2
public class func{
public void getConnection(){
        if(Log.isDebugEnabled())Log.debug("Connecting using dbDriver="+dbDriver+"+ dbUserName="+dbUserName+", dbPassword="+dbUrl);
        return DriverManager.getConnection (dbUrl,
                dbUserName,
                dbPassword);
}
}
