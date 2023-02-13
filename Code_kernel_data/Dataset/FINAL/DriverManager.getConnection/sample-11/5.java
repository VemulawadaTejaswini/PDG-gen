public class func{
public void getConnection(String userName,String password,String server){
        Properties connectionProps = new Properties();
        connectionProps.put("LoginTimeout", "7");
        return DriverManager.getConnection("jdbc:mysql:
}
}
