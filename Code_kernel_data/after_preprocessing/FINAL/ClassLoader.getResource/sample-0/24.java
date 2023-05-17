public class func{
public void getFileForClasspathResource(String resource){
        ClassLoader cloader = Thread.currentThread().getContextClassLoader();
        URL resourceUrl = cloader.getResource( resource );
        if ( resourceUrl == null )
        {
            throw new FileNotFoundException( "Unable to find: " + resource );
        }
        return new File( URI.create( resourceUrl.toString().replaceAll( " ", "%20" ) ) );
}
}
