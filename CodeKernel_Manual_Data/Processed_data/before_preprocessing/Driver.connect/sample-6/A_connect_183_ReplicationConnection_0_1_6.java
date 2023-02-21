public class A{
	public ReplicationConnection(Properties masterProperties,Properties slaveProperties) throws SQLException {
		Driver driver = new Driver();
		//...
		this.slavesConnection = (com.mysql.jdbc.Connection) driver.connect(slaveUrl.toString(), slaveProperties);
	}
}