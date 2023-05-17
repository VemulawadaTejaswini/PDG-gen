//41
public class func{
public void fillCustomersTable(Connection conn){
        Statement statement = conn.createStatement();
        statement.execute(DatabaseCreator.INSERT_CUSTOMERS7);
}
}
