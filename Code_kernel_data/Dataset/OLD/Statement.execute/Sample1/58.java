//57
public class func{
	public void tearDown(){
        Statement s = createStatement();
        s.execute("drop table EXCEPTION_TABLE1");
        s.close();
}
}
