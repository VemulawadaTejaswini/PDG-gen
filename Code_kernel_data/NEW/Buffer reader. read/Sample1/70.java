//69
public class func{
	public void initTemplateContentsFromInputStream(InputStream templateStream){
        StringBuilder builder = new StringBuilder(BUFFER_SIZE);
            while ((nRead = reader.read(cbuf, 0, BUFFER_SIZE)) > 0) {
                builder.append(cbuf, 0, nRead);
            }
            reader.close();
}
}
