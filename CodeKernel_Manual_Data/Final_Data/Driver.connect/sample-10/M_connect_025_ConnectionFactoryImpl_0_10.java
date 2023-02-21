public class A{
	private Connection loadConnection() throws Exception {
		final Class c = Class.forName(driverName);
		final Driver driver = (Driver) c.newInstance();
		return driver.connect(connectUrl, properties);
	}
}