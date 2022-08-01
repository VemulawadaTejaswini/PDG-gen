//321
public class func{
	public void newCleanup(){
            DriverManager.getConnection(
                "jdbc:default:connection");
        return new LucidDbTestCleanup(conn);
}
}
