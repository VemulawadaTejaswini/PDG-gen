public class func{
public void testPrimitives(){
        final PreparedStatement ps = connection.prepareStatement("SELECT tmp.primitives_function();");
        final ResultSet rs = ps.executeQuery();
}
}
