public class func{
public void testObjectStringMappingWithNullString(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT ROW(1,2,'c', null)::tmp.simple_type_for_embed as obj");
        final ResultSet rs = ps.executeQuery();
}
}
