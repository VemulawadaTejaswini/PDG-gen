//225
public class func{
	public void getContent(String url){
      InputStream in = new URL(url).openConnection().getInputStream();
      int len = in.read(buffer);
      while (len > 0) {
        out.append(new String(buffer, 0, len));
        len = in.read(buffer);
      }
}
}
