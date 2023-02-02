//232
public class func{
public void getConnection(){
            connection = DriverManager.getConnection(url, userName, (password != null) ? password : "");
            connection.setReadOnly(true);
}
}
