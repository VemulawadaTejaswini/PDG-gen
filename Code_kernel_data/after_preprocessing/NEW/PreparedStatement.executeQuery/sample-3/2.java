//2
public class func{
public void testEscapeSyntax3(){
        PreparedStatement ps = prepareStatement(
            "select 1 from t1 where '%foobar' like ? escape 'Z'");
        ps.setString(1, "x%foobar");
        JDBC.assertEmpty(ps.executeQuery());
        ps.setString(1, "Z%foobar");
        JDBC.assertSingleValueResultSet(ps.executeQuery(), "1");
        ps.close();
}
}
