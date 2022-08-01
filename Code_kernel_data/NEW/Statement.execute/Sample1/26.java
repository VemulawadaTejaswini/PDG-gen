//25
public class func{
	public void updateHeartbeat(){
    Statement st = getConnection().createStatement();
    st.execute("UPDATE ttirc_system SET value = NOW() WHERE "+m_dbKeyParam+" = 'MASTER_HEARTBEAT'");
    st.close();
}
}
