//185
public class func{
public void testDeleteFilter(boolean autoCommit){
        Connection conn = DriverManager.getConnection(getUrl());
        initTableValues(conn);
        assertTableCount(conn, "IntIntKeyTest", NUMBER_OF_ROWS);
        conn.setAutoCommit(autoCommit);
        assertEquals(1,conn.createStatement().executeUpdate(deleteStmt));
}
}
