//21
public class func{
	public void initOdeDb(){
        Connection conn = ((DataSource) getBean("odeDS")).getConnection();
        Statement s = conn.createStatement();
        s.execute("delete from bpel_process");
        s.close();
}
}
