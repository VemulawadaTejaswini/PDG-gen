//87
public class func{
	public void readString(InputStream is,String encoding){
      reader= new BufferedReader(new InputStreamReader(is, encoding));
      while ((read= reader.read(part)) != -1)
        buffer.append(part, 0, read);
      return buffer.toString();
}
}
