public class func{
public void testDivideByZeroExpressionIndex(){
        Connection conn = DriverManager.getConnection(getUrl());
            stmt = conn.createStatement();
            stmt.execute("CREATE INDEX i ON t (k1/0)");
}
}
