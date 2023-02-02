//174
public class func{
	public void getPages(){
      PreparedStatement psPages = evalDb.getConnection().prepareStatement("SELECT t.page_id FROM "
        + truthTableName + " t GROUP BY page_id");
      ResultSet res = psPages.executeQuery();
      while (res.next()) {
        pages.add(res.getInt("page_id"));
      }
}
}
