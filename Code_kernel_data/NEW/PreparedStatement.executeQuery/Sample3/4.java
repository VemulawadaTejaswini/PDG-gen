//3
public class func{
	public void testLikeWithHighestValidCharacter(){
        for (int i = 0; i < match.length; i++) {
            ps.setString(1, match[i]);
            JDBC.assertSingleValueResultSet(ps.executeQuery(), "1");
        }
        ps.setString(1, "");
        JDBC.assertEmpty(ps.executeQuery());
        ps.close();
}
}
