public class A{
	public void connect(String password) throws SQLException, CoreException {
		Driver d = driverDescriptor.getDriver();
		
		Properties p = new Properties();
		p.put("user", username);
		p.put("password", password);
		
		connection = d.connect(connectionURL, p);
	}
}