//19
public class func{
	public void testNullObjectInObject(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ROW(null,'str')::tmp.complex_type as obj");
        final ResultSet rs = ps.executeQuery();
}
}
