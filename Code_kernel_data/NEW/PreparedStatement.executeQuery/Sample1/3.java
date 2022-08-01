//2
public class func{
	public void testListWithEmptyEnums(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ARRAY[]::enumeration[] as enum_arr");
        final ResultSet rs = ps.executeQuery();
}
}
