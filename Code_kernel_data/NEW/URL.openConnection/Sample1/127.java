//126
public class func{
	public void loadContextFromWeb(){
        final URL url = new URL(selectedUri);
        final URLConnection con = url.openConnection();
        con.addRequestProperty("Accept", "application/rdf+xml");
        final InputStream inputStream = con.getInputStream();
}
}
