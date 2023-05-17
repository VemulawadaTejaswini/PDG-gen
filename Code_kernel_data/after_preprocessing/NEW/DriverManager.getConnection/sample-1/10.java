//10
public class func{
public void testSortOrderForSingleDescVarLengthCol(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute("CREATE TABLE t (k VARCHAR PRIMARY KEY DESC)");
        conn.createStatement().execute("UPSERT INTO t VALUES ('a')");
        conn.createStatement().execute("UPSERT INTO t VALUES ('ab')");
}
}
