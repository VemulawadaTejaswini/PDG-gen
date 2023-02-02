//24
public class func{
public void configureConnection(Connection conn){
        final Statement statement = conn.createStatement();
        statement.execute("PRAGMA journal_mode = WAL;");
        statement.close();
}
}
