public class func{
public void importLines(InputStream in){
    BufferedReader buffered = new BufferedReader(new InputStreamReader(in));
    while ((line = buffered.readLine()) != null)   {
      lines.add(line);
    }
}
}
