public class func{
public void initDatabase(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        connection.setAutoCommit(false);
        createTweetTable(connection);
}
}
