public class func{
public void testDerby4376(){
        PreparedStatement ps = prepareStatement(
                "select * from d4376 where x in (?, ?)");
        ps.setNull(1, Types.INTEGER);
        ps.setInt(2, 1);
        JDBC.assertSingleValueResultSet(ps.executeQuery(), "1");
}
}
