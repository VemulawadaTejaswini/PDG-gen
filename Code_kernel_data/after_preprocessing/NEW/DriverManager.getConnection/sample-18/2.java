//2
public class func{
public void getTimedOutConnection(String url,String user,String password){
        if (isOracleUrl(url)) {
            // pass in timeout property for Oracle
            Properties info = getOracleJDBCConnectionProperties(user, password);
            return DriverManager.getConnection(url, info);    
        }
        else if (isMySqlUrl(url)) {
            // pass in timeout in URL for MySQL
            url = getMySqlUrl(url);
        }
        return DriverManager.getConnection(url, user, password);
}
}
