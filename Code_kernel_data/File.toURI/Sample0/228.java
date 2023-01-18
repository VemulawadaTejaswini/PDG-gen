//227
public class func{
	public void testGetInstanceString(){
        File f = new File(fedoraUsersXML);
        FedoraUsers fu = FedoraUsers.getInstance(f.toURI());
        assertNotNull(fu);
}
}
