//24
public class func{
	public void getInputStreamAsString(InputStream stream){
      br = new BufferedReader(new InputStreamReader(stream));
      while ((len = br.read(cbuf)) > 0) {
        sb.append(cbuf, 0, len);
      }
      if(br != null) br.close();    
}
}
