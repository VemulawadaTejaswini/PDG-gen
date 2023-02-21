public class A{
	public ReplicationConnection(Properties masterProperties,Properties slaveProperties) throws SQLException {
		Driver driver = new Driver();
		String masterHost = masterProperties.getProperty(NonRegisteringDriver.HOST_PROPERTY_KEY);
		if (masterHost != null) {
			masterUrl.append(masterHost);
		}
		String slaveHost = slaveProperties.getProperty(NonRegisteringDriver.HOST_PROPERTY_KEY);
		if (slaveHost != null) {
			slaveUrl.append(slaveHost);
		}
		String masterDb = masterProperties.getProperty(NonRegisteringDriver.DBNAME_PROPERTY_KEY);
		masterUrl.append("/");
		if (masterDb != null) {
			masterUrl.append(masterDb);
		}
		String slaveDb = slaveProperties.getProperty(NonRegisteringDriver.DBNAME_PROPERTY_KEY);
		slaveUrl.append("/");
		if (slaveDb != null) {
			slaveUrl.append(slaveDb);
		}
		this.masterConnection = (com.mysql.jdbc.Connection) driver.connect(masterUrl.toString(), masterProperties);
		this.slavesConnection = (com.mysql.jdbc.Connection) driver.connect(slaveUrl.toString(), slaveProperties);
		this.currentConnection = this.masterConnection;
	}
}