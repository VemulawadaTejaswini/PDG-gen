public class func{
public void openConnections(){
        m_conn = DriverManager.getConnection(m_jdbc, m_user, m_password);
        m_conn.setAutoCommit(false);
}
}
