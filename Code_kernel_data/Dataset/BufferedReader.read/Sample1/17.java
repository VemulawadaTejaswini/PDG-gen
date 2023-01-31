//16
public class func{
	public void readUTF8FromFile(File file){
    while ((ch = in.read()) > -1) {
      sb.append((char)ch);
    }
    in.close();
}
}
