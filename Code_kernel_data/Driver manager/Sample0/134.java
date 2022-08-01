//133
public class func{
	public void createConnection(int port,String user,String password,String schema){
                (Connection) DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + schema,
                                                         user,
                                                         password);
}
}
