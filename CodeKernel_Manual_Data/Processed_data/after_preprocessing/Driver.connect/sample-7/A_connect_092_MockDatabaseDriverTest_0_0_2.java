public class A{
	public static void main(){
		MockDatabaseDriver.getInstance().connect(MockDatabaseDriver.EXCEPTION_URL, new Properties());
	}
}