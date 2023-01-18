//150
public class func{
	public void readString(InputStream stream){
      BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
      for (int ch = reader.read(); ch >= 0; ch = reader.read()) {
        buf.append((char) ch);
      }
      return buf.toString();
}
}
