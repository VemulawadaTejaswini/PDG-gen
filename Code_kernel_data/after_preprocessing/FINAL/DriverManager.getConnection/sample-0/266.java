public class func{
public void getConnection(String dbType,String url,String dbSchema,String username,String password){
    return new ConnectionProxy(dbType, DriverManager.getConnection(url.trim(), username.trim(), StringUtils.trim(password)), StringUtils.trim(dbSchema));
}
}
