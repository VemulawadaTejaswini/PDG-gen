//116
public class func{
	public void readResource(String name){
      BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
      while ((read = reader.read(buffer)) != -1) {
        stringBuilder.append(buffer, 0, read);
      }
      inputStream.close();
}
}
