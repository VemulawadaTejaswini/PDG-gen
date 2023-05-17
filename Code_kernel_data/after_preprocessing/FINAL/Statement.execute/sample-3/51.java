public class func{
public void closeConnection(Connection connection){
        Statement statement = connection.createStatement();
            statement.execute("drop table employee");
            statement.close();
}
}
