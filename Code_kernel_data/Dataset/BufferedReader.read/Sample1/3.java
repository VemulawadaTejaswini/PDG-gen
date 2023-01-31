//2
public class func{
	public void getText(InputStream stream,String charset){
        int numRead = reader.read(chars);
        while (numRead != -1)
        {
          sw.write(chars, 0, numRead);
          numRead = reader.read(chars);
        }
        reader.close();
}
}
