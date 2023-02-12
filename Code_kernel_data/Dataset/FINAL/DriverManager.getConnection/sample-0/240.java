public class func{
public void testArrayPrependFunctionNulls1(){
        Connection conn = DriverManager.getConnection(getUrl());
        initTableWithVarArray(conn, "VARCHAR", s, null);
        PhoenixArray array2 = (PhoenixArray) conn.createArrayOf("VARCHAR", s2);
}
}
