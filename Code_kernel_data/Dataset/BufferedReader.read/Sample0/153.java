//152
public class func{
	public void toString(InputStream is){
            br = new BufferedReader(new InputStreamReader(is, charSet));
            for (int read; (read = br.read(buf)) != -1; ) {
                result.append(buf, 0, read);
            }
            return result.toString();
}
}
