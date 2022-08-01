//72
public class func{
	public void tearDown(){
        rollback();
        Statement stmt = createStatement ();
        stmt.execute ("drop table updateClob");
        stmt.close();
}
}
