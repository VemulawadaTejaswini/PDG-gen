public class func{
public void getTimedOutConnection(String url,String user,String password){
        if (isOracleUrl(url)) {
            Properties info = getOracleJDBCConnectionProperties(user, password);
            return DriverManager.getConnection(url, info);    
        }
        else if (isMySqlUrl(url)) {
            url = getMySqlUrl(url);
        }
        return DriverManager.getConnection(url, user, password);
}
}
