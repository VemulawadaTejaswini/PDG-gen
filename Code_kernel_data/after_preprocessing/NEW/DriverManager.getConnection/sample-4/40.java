//40
public class func{
public void getConnection(String id){
    Connection conn = connectionCache.getIfPresent(id);
    if (conn == null) {
      conn = DriverManager.getConnection(url, info);
      connectionCache.put(id, conn);
    }
}
}
