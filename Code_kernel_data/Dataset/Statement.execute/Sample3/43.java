//42
public class func{
	public void tearDown(){
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        stmt.execute("drop table BLOBCLOB");
        stmt.close();
}
}
