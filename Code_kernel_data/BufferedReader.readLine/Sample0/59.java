//58
public class func{
	public void readResource(String path){
    InputStream s = LoadUsers.class.getResourceAsStream(path);
    BufferedReader reader = new BufferedReader(new InputStreamReader(s));
    while ((line = reader.readLine()) != null) {
      lines.add(line);
    }
    s.close();
}
}
