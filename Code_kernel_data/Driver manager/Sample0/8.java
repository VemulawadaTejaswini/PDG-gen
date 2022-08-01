//7
public class func{
	public void testCloseDelay(){
            conn = DriverManager.getConnection(url, user, password);
            conn.close();
        conn = DriverManager.getConnection(url, user, password);
        conn.createStatement().execute("SHUTDOWN");
}
}
