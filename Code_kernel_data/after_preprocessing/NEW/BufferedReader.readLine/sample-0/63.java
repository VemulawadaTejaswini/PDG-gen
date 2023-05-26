//63
public class func{
public void getFileContents(IPath path){
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    for (String str = reader.readLine(); str != null; str = reader.readLine()) {
      writer.write(str);
      writer.write('\n');
    }
    return writer.toString();
}
}
