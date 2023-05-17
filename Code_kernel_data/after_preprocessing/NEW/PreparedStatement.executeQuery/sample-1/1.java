//1
public class func{
public void testPrimitiveMappingsWithEmbed(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 1 as i, 2 as l, 'c' as c, 'str' as str");
        final ResultSet rs = ps.executeQuery();
}
}
