public class A{
	public ReplicationConnection(Properties masterProperties,Properties slaveProperties) throws SQLException {
		Driver driver = new Driver();
		this.masterConnection = (com.mysql.jdbc.Connection) driver.connect(masterUrl.toString(), masterProperties);
	}
}