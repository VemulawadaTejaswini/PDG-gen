//6
public class func{
public void getResults(String query){
          PreparedStatement statement = conn.prepareStatement(query);
          ResultSet set = statement.executeQuery();
}
}
