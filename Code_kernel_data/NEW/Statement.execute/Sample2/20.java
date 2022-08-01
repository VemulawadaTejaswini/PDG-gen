//19
public class func{
	public void testAlterSequenceColumn(){
        deleteDb("sequence");
        Connection conn = getConnection("sequence");
        Statement stat = conn.createStatement();
        stat.execute("INSERT INTO TEST (name) VALUES('Other World')");
}
}
