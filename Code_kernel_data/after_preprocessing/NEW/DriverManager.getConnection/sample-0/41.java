//41
public class func{
public void setup(){
        connection = DriverManager.getConnection(dbURL);
        connection.setAutoCommit(true);
        stmt = connection.createStatement();
}
}
