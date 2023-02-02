//421
public class func{
public void getGzipResult(final String url){
        final HttpURLConnection conn = (HttpURLConnection) (new URL(url)).openConnection();
        conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
        conn.setDoInput(true);
        InputStream in = conn.getInputStream();
        Assert.assertTrue(conn.getContentEncoding().contains("gzip"));
        in = new GZIPInputStream(in);
        String result = read(in);
        in.close();
}
}
