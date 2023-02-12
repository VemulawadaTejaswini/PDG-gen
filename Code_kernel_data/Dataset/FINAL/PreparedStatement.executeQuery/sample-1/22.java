public class func{
public void testObjectWithEmptyList(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT ROW(ARRAY[]::tmp.simple_type[], 'str')::tmp.array_type as obj, 'str' as str ");
        final ResultSet rs = ps.executeQuery();
}
}
