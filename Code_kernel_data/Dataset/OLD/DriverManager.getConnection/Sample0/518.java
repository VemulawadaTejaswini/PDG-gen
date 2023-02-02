//517
public class func{
	public void getConnection(){
    Connection conn = DriverManager.getConnection(url, user, password);
    c = new JDCConnection(conn, this);
    c.lease();
    connections.addElement(c);
    return c.getConnection();
}
}
