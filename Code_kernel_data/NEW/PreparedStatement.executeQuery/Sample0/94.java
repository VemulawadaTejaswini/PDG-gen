//93
public class func{
	public void testMultibatchSelectPrepared(){
    s.setFetchSize(100);
    s.setString(1, "0");
    ResultSet rs = s.executeQuery();
    while (rs.next()) {
      i++;
      rs.getString(1);
    }
}
}
