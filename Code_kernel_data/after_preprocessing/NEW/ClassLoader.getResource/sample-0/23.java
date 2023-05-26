//23
public class func{
public void getTestDir(final String name){
        ClassLoader cloader = Thread.currentThread().getContextClassLoader();
        URL resource = cloader.getResource( name );
        if ( resource == null )
        {
            throw new IOException( "Cannot find test directory: " + name );
        }
        return new File( new URI( resource.toExternalForm() ).normalize().getPath() );
}
}
