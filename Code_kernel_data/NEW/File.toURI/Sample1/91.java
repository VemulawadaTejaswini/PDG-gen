//90
public class func{
	public void getFilePath(){
            final File dir = createTempDirectory();
            return ioService().get( dir.toURI() ).resolve( "myTempFile.txt" );
}
}
