//51
public class func{
	public void readInFile(File file){
        buf.rewind();
        if ((read = fc.read(buf)) != -1) {
          buf.rewind();
          for (; read != 0; read--) {
            appender.append((char) buf.get());
          }
        }
        else {
          break;
        }
      fc.close();
}
}
