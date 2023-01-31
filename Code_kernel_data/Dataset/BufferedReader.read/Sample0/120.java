//119
public class func{
	public void read(InputStream in){
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
      while ((read = bufferedReader.read(buffer, 0, buffer.length)) > 0) {
        stringBuilder.append(buffer, 0, read);
      }
      return stringBuilder.toString();
}
}
