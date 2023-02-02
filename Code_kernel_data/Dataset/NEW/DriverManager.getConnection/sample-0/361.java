//361
public class func{
public void testSingleByteInstrAscending(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ASC", "abcdefghijkl","fgh");
        testInstr(conn, queryToExecute, 6);
}
}
