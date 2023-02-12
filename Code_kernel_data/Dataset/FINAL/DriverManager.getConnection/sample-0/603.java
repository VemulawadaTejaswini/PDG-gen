public class func{
public void getConnection(String userName,String passWord){
    Connection c = DriverManager.getConnection(dbURL, userName, passWord);
}
}
