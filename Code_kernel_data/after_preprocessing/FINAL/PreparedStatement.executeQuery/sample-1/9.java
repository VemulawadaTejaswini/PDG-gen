public class func{
public void testColumnMappings(){
        final PreparedStatement ps = connection.prepareStatement("SELECT 2 as l, 'c' as c");
        final ResultSet rs = ps.executeQuery();
}
}
