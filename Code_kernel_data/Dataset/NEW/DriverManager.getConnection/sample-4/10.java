//10
public class func{
public void getDefaultConnection(){
    if (m_conn == null)
    {
      m_conn = DriverManager.getConnection("jdbc:default:connection");
    }
}
}
