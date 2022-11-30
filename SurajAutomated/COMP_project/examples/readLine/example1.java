//0
public class func{
	public void getDataFromURL(String url){
        URL theURL = new URL(url);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(theURL.openStream()));
        while ((line = bufferedReader.readLine()) != null) data += line;
        bufferedReader.close();
}
}
