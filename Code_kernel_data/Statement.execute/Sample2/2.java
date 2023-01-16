//1
public class func{
	public void createDDL(){
        Connection conn = DriverManager.getConnection(create_url);
        Statement stmt = conn.createStatement();
        stmt.execute("CREATE TABLE T_BASIC_TYPE (F1 FLOAT, F2 DOUBLE, F3 REAL, F4 DATE, F5 TIME, F6 SMALLINT, F7 SMALLINT, F8 INTEGER, F9 BIGINT, F10 DECIMAL(9,2), F11 TIMESTAMP, F12 BLOB, F13 VARCHAR(256), F14 VARCHAR(256), F15 VARCHAR(256), F16 VARCHAR(256), F17 SMALLINT)");
}
}
