//145
public class func{
	public void testSingleByteInstrDescendingNoString(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", "abcde fghijkl","lmn");
        testInstr(conn, queryToExecute, 0);
}
}
