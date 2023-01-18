//20
public class func{
	public void testHStoreFilled(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 'str' as str, hstore('key', 'val') as map");
        final ResultSet rs = ps.executeQuery();
}
}
