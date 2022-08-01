//14
public class func{
	public void testPrimitiveMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 1 as i, 2 as l, 'c' as c");
        final ResultSet rs = ps.executeQuery();
}
}
