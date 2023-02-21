public class A{
	//...
	public static void main(){
		final Driver d = MockDatabaseDriver.getInstance();
		assertNull(d.connect("d200610151816", new Properties()));
	}
}