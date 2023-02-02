//88
public class func{
public void testSplit_Upsert(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTable(conn, "ONE,TWO,THREE");
        conn.createStatement().executeUpdate("UPSERT INTO SPLIT_TEST (ID, ARR) SELECT ID, " +
                "REGEXP_SPLIT(VAL, ',') FROM SPLIT_TEST");
}
}
