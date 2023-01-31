//109
public class func{
	public void toByteArray(final URL url){
        final URLConnection conn = url.openConnection();
            return IOUtils.toByteArray(conn);
            close(conn);
}
}
