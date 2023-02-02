//0
public class func{
public void getBufferedReader(URL source){
        URLConnection conn = source.openConnection();
        boolean isGzipped = conn.getContentType() != null && conn.getContentType().equalsIgnoreCase("application/x-gzip")
                || conn.getContentEncoding() != null && conn.getContentEncoding().equalsIgnoreCase("gzip");
        InputStream uis = conn.getInputStream();
        return new BufferedReader(isGzipped?
            new InputStreamReader(new GZIPInputStream(uis)):
            new InputStreamReader(uis));    
}
}
