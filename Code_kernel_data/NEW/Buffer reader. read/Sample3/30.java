//29
public class func{
	public void inputStreamToString(InputStream in){
    StringBuilder stringBuilder = new StringBuilder(BUFFER_SIZE);
      while ((bytesRead = bufferedReader.read(buffer, 0, BUFFER_SIZE)) > 0) {
        stringBuilder.append(buffer, 0, bytesRead);
      }
}
}
