//17
public class func{
public void execute(String sql){
    final Statement statement = connection.createStatement();
    statement.execute(sql);
    statement.close();
}
}
