//40
public class func{
	public void testLobServerMemory(){
        deleteDb("lob");
        Connection conn = getConnection("lob");
        Statement stat = conn.createStatement();
        stat.execute("CREATE TABLE TEST(ID INT, DATA CLOB)");
}
}
