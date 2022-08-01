//0
public class func{
	public void readContent(InputStream stream,String charset){
      int n = reader.read(readBuffer);
      while (n > 0)
      {
        buffer.append(readBuffer, 0, n);
        n = reader.read(readBuffer);
      }
}
}
