public class func{
public void testVanityDriverArgsInUrl(){
        DriverManager.getConnection("jdbc:csv:"
            + "directory='foo'");
    connection.close();
}
}
