//305
public class func{
public void testFirstUseIsCached(){
            URLConnection connection2 = new URL("http://android.com/").openConnection();
            assertFalse(connection2 instanceof Handler.HandlerURLConnection);
}
}
