//61
public class func{
	public void tearDown(){
        Statement stmt = createStatement();
        stmt.execute ("drop table testblob");
        stmt.close();
}
}
