//398
public class func{
public void closeConnection(Connection conn){
                DriverManager.getConnection("jdbc:derby:;shutdown=true");
}
}
