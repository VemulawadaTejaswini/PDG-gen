//8
public class func{
	public void execCmd(File wd,String[] cmdWithArguments,StringBuffer out){
    Reader reader = new InputStreamReader(p.getInputStream());
    BufferedReader input = new BufferedReader(reader);
    while ((readChar = input.read()) != -1) {
      out.append((char) readChar);
    }
    input.close();
}
}
