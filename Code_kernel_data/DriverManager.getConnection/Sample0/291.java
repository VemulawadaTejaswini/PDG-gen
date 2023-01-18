//290
public class func{
	public void makeConnection(){
        Connection conn = DriverManager.getConnection(workConf.getDBConnection(),
                workConf.getDBUsername(),
                workConf.getDBPassword());
        Catalog.setSeparator(conn);
}
}
