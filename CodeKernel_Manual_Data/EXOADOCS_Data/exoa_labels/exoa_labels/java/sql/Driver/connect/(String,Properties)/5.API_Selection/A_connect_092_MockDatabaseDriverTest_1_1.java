public class A{
	//...
	public static void main(){
		final Driver d = MockDatabaseDriver.getInstance();
		//...
		assertSame(c, d.connect("jdbc:d200610151819", new Properties()));
	}
}