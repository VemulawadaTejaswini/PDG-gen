//39
public class func{
public void runSql(ConnectionProvider provider,String sql){
    Connection connection = provider.getConnection();
      Statement statement = connection.createStatement();
      statement.execute(sql);
}
}
