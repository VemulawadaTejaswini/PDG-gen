//292
public class func{
public void testDefaultUseCachesSetsInitialValueOnly(){
        URL url = new URL("http://localhost/");
        URLConnection c2 = url.openConnection();
        assertTrue(c1.getDefaultUseCaches());
        c1.setDefaultUseCaches(false);
            assertTrue(c1.getUseCaches());
}
}
