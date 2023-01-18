//6
public class func{
	public void testListWithInvalidEnums(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ARRAY['VALUE_3'::enumeration]::enumeration[] as enum_arr");
        ps.executeQuery();
}
}
