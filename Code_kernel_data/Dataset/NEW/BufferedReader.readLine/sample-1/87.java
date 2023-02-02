//87
public class func{
public void readFile(File tmpFile){
    while ((strLine = fi.readLine()) != null)   {
      out.append(strLine);
      out.append("\n");
    }
    return out.toString();
}
}
