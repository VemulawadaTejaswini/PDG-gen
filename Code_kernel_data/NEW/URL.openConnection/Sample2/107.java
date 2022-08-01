//106
public class func{
	public void loadImage(URL url){
            URLConnection connection = url.openConnection();
            return (Bitmap) mBitmapContentHandler.getContent(connection);
}
}
