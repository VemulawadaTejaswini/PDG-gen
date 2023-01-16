//274
public class func{
	public void connect(){
            log.info("Connecting to " + jdbcUrl);
            connect = DriverManager.getConnection(jdbcUrl);
            statement = connect.createStatement();
}
}
