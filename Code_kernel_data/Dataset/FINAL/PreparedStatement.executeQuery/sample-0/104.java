public class func{
public void getResourceMeta(PreparedStatement statement){
    ResultSet results = statement.executeQuery();
      if (results.next()) {
        return metaFromResult(results);
      }
      results.close();
}
}
