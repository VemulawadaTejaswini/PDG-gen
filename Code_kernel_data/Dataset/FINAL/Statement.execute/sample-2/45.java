public class func{
public void fillOrdersTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute(DatabaseCreator.INSERT_ORDERS10);
}
}
