public class func{
public void testGetInputStream(){
        URL txtFile = new File( "target/test-classes/source.txt" ).toURI().toURL();
        UrlSource source = new UrlSource( txtFile );
}
}
