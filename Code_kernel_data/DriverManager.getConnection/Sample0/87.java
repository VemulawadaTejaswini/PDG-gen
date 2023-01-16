//86
public class func{
	public void connect(Configuration hiveconf){
      DriverManager.setLoginTimeout(3); // stats should not block
      conn = DriverManager.getConnection(connectionString);
}
}
