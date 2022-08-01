//85
public class func{
	public void inputStream2String(InputStream is){
    while ((line = in.readLine()) != null) {
      buffer.append(line);
    }
    return buffer.toString();
}
}
