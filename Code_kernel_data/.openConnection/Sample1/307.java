//306
public class func{
	public void testFirstUseIsCached(){
        URLConnection connection1 = new URL("http://android.com/").openConnection();
        assertFalse(connection1 instanceof Handler.HandlerURLConnection);
            System.setProperty("java.protocol.handler.pkgs", getHandlerPackageName());
}
}
