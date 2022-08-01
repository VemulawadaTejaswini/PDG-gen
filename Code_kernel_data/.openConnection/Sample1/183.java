//182
public class func{
	public void downloadList(String libURL){
            URL url = new URL(libURL);
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            InputSupplier<InputStream> urlSupplier = new URLISSupplier(connection);
            return CharStreams.readLines(CharStreams.newReaderSupplier(urlSupplier, Charsets.UTF_8));
}
}
