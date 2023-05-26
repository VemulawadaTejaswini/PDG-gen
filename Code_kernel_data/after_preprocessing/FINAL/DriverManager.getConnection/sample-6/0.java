public class func{
public void openConnection(boolean autocommit){
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:example;DB_CLOSE_DELAY=-1");
        conn.setAutoCommit(autocommit);
}
}
