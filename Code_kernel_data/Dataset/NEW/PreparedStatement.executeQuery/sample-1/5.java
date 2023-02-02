//5
public class func{
public void testObjectWithNullList(){
        final PreparedStatement ps = connection.prepareStatement("SELECT null as arr, 'str' as str ");
        final ResultSet rs = ps.executeQuery();
}
}
