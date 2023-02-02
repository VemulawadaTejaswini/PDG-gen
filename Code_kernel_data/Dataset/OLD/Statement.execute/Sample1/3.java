//2
public class func{
	public void delete(){
        Statement stmt = con.createStatement();
        stmt.execute("delete from tab1 where i = " + keyVal);
        stmt.close();
}
}
