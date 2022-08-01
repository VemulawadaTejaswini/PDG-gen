//123
public class func{
	public void readFile(String input){
      fr = new InputStreamReader(new FileInputStream(input), ENCODING);
      br = new BufferedReader(fr);
      while ((len = br.read(buffer)) > -1) {
        content.append(buffer, 0, len);
      }
}
}
