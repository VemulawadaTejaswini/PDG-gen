public class func{
public void hasResults(PreparedStatement statement){
    ResultSet rs = statement.executeQuery();
      return rs.next();
      rs.close();
}
}
