//71
public class func{
	public void relativize(File base,File file){
        return new File( base.toURI().relativize( file.toURI() ).getPath() );
}
}
