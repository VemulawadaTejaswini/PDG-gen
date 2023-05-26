//362
public class func{
public void initDatabase(){
        connection = DriverManager.getConnection(DATABASE_URL, "sa", "pwd");
        createTweetTable(connection);
        populateTweetTable(connection);
}
}
