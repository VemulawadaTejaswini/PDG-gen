public class func{
public void rdRow(BufferedReader is){
    line = is.readLine ();
    if (line == null)
      return null;
    return line.split ("\\s*" + SEPARATOR + "\\s*");
}
}
