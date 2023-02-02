//132
public class func{
public void testMultiByteInstrDecending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "DESC", "AÉšÉ¦FGH","ÉšÉ¦");
        testInstr(conn, queryToExecute, 2);
}
}
