//15
public class func{
	public void getFileAsString(File file,String charEncoding){
    while ((ch = in.read()) > -1) {
      sb.append((char)ch);
    }
    in.close();
}
}
