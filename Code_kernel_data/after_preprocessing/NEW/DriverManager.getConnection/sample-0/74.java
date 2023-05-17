//74
public class func{
public void getConnection(){
            int oldTimeout = DriverManager.getLoginTimeout();
            DriverManager.setLoginTimeout(m_timeout);
            Connection conn = DriverManager.getConnection(m_url, m_properties);
            DriverManager.setLoginTimeout(oldTimeout);
}
}
