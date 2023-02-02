//419
public class func{
	public void createConnection(boolean autocommit){
        conn = DriverManager.getConnection(this.getConnectionString(), this.getUsername(), this.getPassword());    
}
}
