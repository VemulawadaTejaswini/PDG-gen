//39
public class func{
	public void testDistinctIdenticalNullRows(){
        Statement s = createStatement();
        s.execute("insert into t (i) values (null)");
}
}
