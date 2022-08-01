//28
public class func{
	public void testCastingOnConstantAddInArithmeticEvaluation(){
        Connection conn = DriverManager.getConnection(getUrl());
        conn.createStatement().execute(ddl);
        conn.createStatement().execute(dml);
}
}
