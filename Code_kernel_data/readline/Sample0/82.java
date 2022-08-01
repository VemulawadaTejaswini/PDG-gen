//81
public class func{
	public void saveFile(InputStream st,File testFile){
    BufferedReader r = new BufferedReader(new InputStreamReader(st));
      while ((line = r.readLine()) != null) {
        wr.println(line);
      }
}
}
