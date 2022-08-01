//1
public class func{
	public void readFromStream(InputStream inputStream){
    BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
    String line = in.readLine();
    while (line != null) {
      read += line + "\n";
      line = in.readLine();
    }
}
}
