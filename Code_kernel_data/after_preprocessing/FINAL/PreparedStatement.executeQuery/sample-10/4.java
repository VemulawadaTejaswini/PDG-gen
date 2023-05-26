public class func{
public void testNegativeZeroFloatJvmBug(){
            JDBC.assertSingleValueResultSet(ps.executeQuery(), "0.0");
}
}
