//23
public class func{
public void testPrimitivesWithSearchPath(){
        DbFunctionRegister.reInitRegistry(connection);
        final PreparedStatement ps = connection.prepareStatement("SELECT primitives_function();");
        final ResultSet rs = ps.executeQuery();
}
}
