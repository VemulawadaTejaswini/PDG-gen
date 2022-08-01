//270
public class func{
	public void fillStreamFromHttpFile(Uri uri){
            URL url = new URL(uri.getPath());
            url.openConnection();
            inStream = new BufferedInputStream(url.openStream());
}
}
