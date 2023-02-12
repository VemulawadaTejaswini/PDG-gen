public class func{
public void loadSource(InputStream is){
      BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
      while ((line = br.readLine()) != null) {
        addSourceLineEntry(line);
      }
}
}
