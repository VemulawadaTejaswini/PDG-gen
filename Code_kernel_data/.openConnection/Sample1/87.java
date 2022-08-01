//86
public class func{
	public void resolve(String href,String base){
                url = new URL(baseURI + "/"  + href);
                final URLConnection connection = url.openConnection();
                return new StreamSource(connection.getInputStream());
}
}
