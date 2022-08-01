//22
public class func{
	public void parse(Reader reader){
    BufferedReader br = new BufferedReader(reader);
    while ((line = br.readLine()) != null) {
      if (!line.startsWith("#")) {
        parse(line);
      }
    }
}
}
