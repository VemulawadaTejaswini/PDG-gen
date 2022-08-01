//10
public class func{
	public void testHStoreNull(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 'str' as str, null as map");
        final ResultSet rs = ps.executeQuery();
}
}
