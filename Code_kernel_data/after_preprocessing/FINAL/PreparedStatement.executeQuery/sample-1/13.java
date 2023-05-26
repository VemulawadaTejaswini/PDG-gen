public class func{
public void testNullString(){
        final PreparedStatement ps = connection.prepareStatement("SELECT null as str");
        final ResultSet rs = ps.executeQuery();
}
}
