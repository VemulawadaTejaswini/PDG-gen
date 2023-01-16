//21
public class func{
	public void processFile(String src,String dst){
      while ((ch = in.read()) != -1)
        out.append((char)ch);
      out.append("\n"); //fix for the bug than .end method ends by EOF but not CRLF
      in.close();
}
}
