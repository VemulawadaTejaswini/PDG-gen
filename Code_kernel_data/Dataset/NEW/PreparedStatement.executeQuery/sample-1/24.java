//24
public class func{
public void testSimpleStringSet(){
        final PreparedStatement ps = connection.prepareStatement(
                "SELECT 'str' as str, ARRAY['result_1', 'result_2']::text[] as arr");
        final ResultSet rs = ps.executeQuery();
}
}
