public class A{
	public static void main(){
		Driver d = driverDescriptor.getDriver();
		Properties p = new Properties();
		connection = d.connect(connectionURL, p);
	}
}