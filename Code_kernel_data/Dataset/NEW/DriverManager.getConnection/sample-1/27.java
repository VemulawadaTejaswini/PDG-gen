//27
public class func{
public void testColumnDisplaySize(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(
                "CREATE TABLE T (pk1 CHAR(15) not null, pk2 VARCHAR not null,  v1 VARCHAR(15), v2 DATE, v3 VARCHAR " +
                "CONSTRAINT pk PRIMARY KEY (pk1, pk2)) ");
        ResultSet rs = conn.createStatement().executeQuery("SELECT pk1, pk2, v1, v2, NULL FROM T");
        assertEquals(15, rs.getMetaData().getColumnDisplaySize(1));
        assertEquals(PhoenixResultSetMetaData.DEFAULT_DISPLAY_WIDTH, rs.getMetaData().getColumnDisplaySize(2));
        assertEquals(15, rs.getMetaData().getColumnDisplaySize(3));
        assertEquals(conn.unwrap(PhoenixConnection.class).getDatePattern().length(), rs.getMetaData().getColumnDisplaySize(4));
}
}
