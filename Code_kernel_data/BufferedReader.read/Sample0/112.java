//111
public class func{
	public void readString(final InputStream is){
            reader = new BufferedReader(new InputStreamReader(is));
            while ((read = reader.read(part)) != -1) {
                buffer.append(part, 0, read);
            }
            return buffer.toString();
}
}
