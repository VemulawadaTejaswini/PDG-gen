//540
public class func{
	public void copy(InputStream in,URL out,String method){
    URLConnection c = out.openConnection();
    if (c instanceof HttpURLConnection && method != null) {
      HttpURLConnection http = (HttpURLConnection) c;
      http.setRequestMethod(method);
    }
    c.setDoOutput(true);
    OutputStream os = c.getOutputStream();
      copy(in, os);
      os.close();
}
}
