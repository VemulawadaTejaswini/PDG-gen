//109
public class func{
public void loadFromDb(DB db){
    PreparedStatement ps = db.getConnection().prepareStatement("SELECT * FROM page");
    ResultSet res = ps.executeQuery();
    while(res.next()) {
      pageMap.forcePut(res.getString("page_title"), res.getInt("page_id"));
    }
}
}
