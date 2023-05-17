public class func{
public void testWithUrl(){
        File f = new File( "./target/test-jcl.jar" );
        JarClassLoader jc = new JarClassLoader( new URL[] { f.toURI().toURL() } );
        Object testObj = jc.loadClass( "org.xeustechnologies.jcl.test.Test" ).newInstance();
        assertNotNull( testObj );
}
}
