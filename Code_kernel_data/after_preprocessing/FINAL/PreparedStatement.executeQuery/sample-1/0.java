public class func{
public void testMappingsWithEmbedEnumAndEnumDBTypes(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'VALUE_1'::enumeration as a, 'VALUE_2'::enumeration as b, 'str' as str");
        final ResultSet rs = ps.executeQuery();
}
}
