//32
public class func{
	public void read_attributes(Attributes attr,BufferedReader br){
    String s = br.readLine();
    while (s != null && (! s.equals("")))
      {
        readAttribute(attr, s, br);
        s = br.readLine();
      }
}
}
