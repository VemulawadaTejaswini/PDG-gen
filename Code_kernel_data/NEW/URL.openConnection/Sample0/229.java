//228
public class func{
	public void testDoubleCompression(){
        for (String endpoint : Arrays.asList("autoZip","ownZip")) {
            HttpURLConnection con = (HttpURLConnection) new URL(this.url, endpoint).openConnection();
            con.setRequestProperty("Accept-Encoding","gzip");
            byte[] data = IOUtils.toByteArray(con.getInputStream());
            data = IOUtils.toByteArray(new GZIPInputStream(new ByteArrayInputStream(data)));
            assertEquals(new String(data), CONTENT);
        }
}
}
