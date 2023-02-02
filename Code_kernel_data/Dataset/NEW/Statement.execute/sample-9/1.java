//1
public class func{
public void testNoTablePrivileges(){
        Statement stmt = con.createStatement();
        stmt.execute("REVOKE ALL ON metadatatest FROM PUBLIC");
}
}
