//20
public class func{
	public void testSchemaSearchPath(){
        deleteDb("sequence");
        Connection conn = getConnection("sequence");
        Statement stat = conn.createStatement();
        stat.execute("CALL TEST_SEQ.CURRVAL");
}
}
