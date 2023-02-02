//24
public class func{
public void dropTable(){
        Connection connection = createConnection();
        Statement statement = connection.createStatement();
        statement.execute("drop table ACCOUNT");
}
}
