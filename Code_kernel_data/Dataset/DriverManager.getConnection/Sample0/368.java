//367
public class func{
	public void getSlaveConnection(){
        this.jdbcSlaveConnection = DriverManager.getConnection("jdbc:mysql://" + slaveServer + "/" + dbRelease, dbUser, dbPassword);
}
}
