//10
public class func{
	public void connect(){
        m_c = (m_suser == null && m_spassword == null)
        ? DriverManager.getConnection(m_surl)
        : DriverManager.getConnection(m_surl, m_suser, m_spassword);         
        m_c.setAutoCommit(true);
}
}
