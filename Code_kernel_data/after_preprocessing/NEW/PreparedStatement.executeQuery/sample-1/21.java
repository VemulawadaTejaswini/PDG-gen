//21
public class func{
public void testEnumMappingsWithEnumInComplexType(){
        final PreparedStatement ps = connection.prepareStatement(
                "select * from simple_with_enumeration_type_function();");
        final ResultSet rs = ps.executeQuery();
}
}
