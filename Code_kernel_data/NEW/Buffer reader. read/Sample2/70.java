//69
public class func{
	public void parseForm(InputStream entityStream){
      do
      {
         wasRead = reader.read(buffer, 0, 100);
         if (wasRead > 0) buf.append(buffer, 0, wasRead);
      } while (wasRead > -1);
      String form = buf.toString();
}
}
