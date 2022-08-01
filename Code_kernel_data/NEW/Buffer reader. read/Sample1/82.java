//81
public class func{
	public void loadContents(InputStream stream,Charset charset){
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
      return writer.toString();
}
}
