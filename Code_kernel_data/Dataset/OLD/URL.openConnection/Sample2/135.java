//134
public class func{
	public void getResourceStream(@NotNull final URL url){
    val connection = url.openConnection();
    int length = connection.getContentLength();
    val is = connection.getInputStream();
}
}
