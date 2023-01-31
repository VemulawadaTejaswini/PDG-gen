//471
public class func{
	public void createConnection(boolean autocommit){
    conn = DriverManager.getConnection(this.getConnectionString()+";create=true",this.getSchemaName(), this.getPassword());   
}
}
