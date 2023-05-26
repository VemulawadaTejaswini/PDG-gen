//104
public class func{
public void connect(SQLiteConfig config){
            connection = DriverManager.getConnection("jdbc:sqlite:".concat(db), config.toProperties());
            statement = connection.createStatement();
            statement.setQueryTimeout(queryTimeout);
}
}
