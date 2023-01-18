//48
public class func{
	public void testOpenBufferedStream(){
    while ((read = reader.read(buf)) != -1) {
      writer.write(buf, 0, read);
    }
    reader.close();
}
}
