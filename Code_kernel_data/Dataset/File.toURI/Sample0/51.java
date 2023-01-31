//50
public class func{
	public void getClassPaths(){
    for ( int i = 0; i < urls.length; i++ ) {
      urls[i] = new File( paths[i] ).toURI( ).toURL( );
    }
}
}
