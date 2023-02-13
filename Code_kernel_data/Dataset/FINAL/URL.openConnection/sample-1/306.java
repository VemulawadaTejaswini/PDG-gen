public class func{
public void testFirstUseIsCached(){
        URLConnection connection1 = new URL("http:
        assertFalse(connection1 instanceof Handler.HandlerURLConnection);
            System.setProperty("java.protocol.handler.pkgs", getHandlerPackageName());
}
}
