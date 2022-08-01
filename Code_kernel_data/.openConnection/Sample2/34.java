//33
public class func{
	public void getOutputStream(URI uri){
                URL url = getServletContext().getResource(uri.toASCIIString());
                return url.openConnection().getOutputStream();
}
}
