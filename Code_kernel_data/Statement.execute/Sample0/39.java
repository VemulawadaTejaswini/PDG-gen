//38
public class func{
	public void testDistinctSomeNullRows(){
        Statement s = createStatement();
        s.execute("insert into t (i) values (null)");
}
}
