//17
public class func{
	public void loadDataFromURL(URL url,String contentType,Sail sail){
        String lang = urlToModelLang(url, contentType);
        if (lang != null) {
            URLConnection conn = url.openConnection();
            
            //setRequestHeaders(conn, LongwellUtilities.getLabel() + "/" + LongwellUtilities.getVersion());
            
            conn.connect();
            InputStream stream = conn.getInputStream();
            try {
                loadDataFromStream(stream, url.toExternalForm(), lang, sail);
            } catch (Exception e) {
                throw new RuntimeException("Error loading data from URL: " + url + " " + e.getMessage());
            } finally {
                stream.close();
            }
        } else {
            throw new ModelReadFromFileException("Unknown data format in " + url.toExternalForm());
        }
}
}
