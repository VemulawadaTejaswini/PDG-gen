//183
public class func{
public void assertScalarResult(String queryText,int expectedValue){
        PreparedStatement ps = chattyPrepare( queryText );
        ResultSet rs = ps.executeQuery();
        rs.next();
        assertEquals( expectedValue, rs.getInt( 1 ) );
        rs.close();
}
}
