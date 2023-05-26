public class func{
public void execCmd(File wd,String[] cmdWithArguments,StringBuffer out){
    reader = new InputStreamReader(p.getErrorStream());
    input = new BufferedReader(reader);
    while ((readChar = input.read()) != -1) {
      out.append((char) readChar);
    }
    input.close();
}
}
