//35
public class func{
	public void sanitizeXmlDocument(DefaultHandler handler,InputStream inputStream){
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(inputStream, Constants.DEFAULT_ENCODING));
                while ((read = br.read(buf)) != -1) {
                    listingDocBuffer.append(buf, 0, read);
                }
                br.close();
}
}
