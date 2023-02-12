public class func{
public void assertCharacterPadding(PreparedStatement statement,String rowKey,String testString){
        ResultSet rs = statement.executeQuery();
        assertTrue(rs.next());
        assertEquals(rowKey, rs.getString(1));
        assertEquals(testString, rs.getString(2));
}
}
