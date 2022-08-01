//132
public class func{
	public void testMultiByteInstrDecending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", "AɚɦFGH","ɚɦ");
        testInstr(conn, queryToExecute, 2);
}
}
