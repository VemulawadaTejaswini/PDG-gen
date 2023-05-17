public class func{
public void execute(String sql){
    Statement statement = connection.createStatement();
      statement.execute(sql);
      statement.close();
}
}
