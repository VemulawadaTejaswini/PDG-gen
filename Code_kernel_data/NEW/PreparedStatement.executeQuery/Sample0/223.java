//222
public class func{
	public void testQueryCacheTimestamp(){
        rs = prep.executeQuery();
        rs.next();
        String b = rs.getString(1);
        assertFalse(a.equals(b));
        conn.close();
}
}
