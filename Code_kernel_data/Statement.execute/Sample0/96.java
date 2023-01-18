//95
public class func{
	public void testNoTablePrivileges(){
        stmt.execute("REVOKE ALL ON metadatatest FROM " + TestUtil.getUser());
}
}
