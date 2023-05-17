public class func{
public void testSetSchemaProcedure(){
        Statement s = createStatement();
        s.execute("CALL APP.SET_SCHEMA('FOO')");
}
}
