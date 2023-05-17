public class func{
public void getConnection(String urlString){
      conn = connURL.openConnection(m_httpProxy);
      conn = connURL.openConnection();
    conn.setConnectTimeout(60000);
}
}
