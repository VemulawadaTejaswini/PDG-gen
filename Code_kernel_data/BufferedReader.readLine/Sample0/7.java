//6
public class func{
	public void readInputStream(InputStream is,List<String> stringList){
    BufferedReader in = new BufferedReader(new InputStreamReader(is));
    while ((line = in.readLine()) != null) {
      stringList.add(line);
    }
    in.close();
}
}
