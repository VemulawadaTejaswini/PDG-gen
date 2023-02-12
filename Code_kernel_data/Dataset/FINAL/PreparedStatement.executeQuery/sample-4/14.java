public class func{
public void check(){
      connection = Factory.getConnection(null);
      PreparedStatement statement = connection.prepareStatement("SELECT 1");
      statement.executeQuery();
}
}
