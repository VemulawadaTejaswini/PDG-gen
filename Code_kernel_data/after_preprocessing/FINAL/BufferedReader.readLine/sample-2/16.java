public class func{
public void readFile(InputStream is){
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    String line = br.readLine();
    while (line != null) {
      result.append(line + "\n");
      line = br.readLine();
    }
}
}
