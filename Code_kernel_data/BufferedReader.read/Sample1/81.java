//80
public class func{
	public void loadContents(File file,Charset charset){
      while ((c = reader.read()) != -1) {
        writer.write(c);
      }
      return writer.toString();
}
}
