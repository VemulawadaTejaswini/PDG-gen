//53
public class func{
	public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute("DROP TABLE T0");
        stmt.close();
}
}
