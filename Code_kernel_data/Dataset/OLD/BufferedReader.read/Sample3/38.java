//37
public class func{
	public void convertToString(InputStream is){
    while((cacheSize = reader.read(cache)) != STREAM_EOF){
      String data = new String(cache, 0, cacheSize);
      sb.append(data);
    }
    return sb.toString();
}
}
