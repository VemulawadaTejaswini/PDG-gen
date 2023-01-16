//32
public class func{
	public void textFileToString(String fileLocation){
    BufferedReader br = new BufferedReader(
        new InputStreamReader(getClass().getResourceAsStream(fileLocation)));
    while ((line = br.readLine()) != null) {
      fileString += line;
    }
    br.close();
}
}
