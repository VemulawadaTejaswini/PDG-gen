//24
public class func{
public void setUp(){
        conn = DriverManager.getConnection(getUrl());
        conn.setAutoCommit(true);
        stmt = conn.createStatement();
        stmt.execute("CREATE TABLE without_nulls (" +
                        "id SMALLINT NOT NULL PRIMARY KEY, " +
                        "name VARCHAR) " +
                "VERSIONS = 1000, KEEP_DELETED_CELLS = false");
}
}
