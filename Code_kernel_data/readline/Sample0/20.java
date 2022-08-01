//19
public class func{
	public void convertInputStreamToString(InputStream inputStream){
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        while((line = bufferedReader.readLine()) != null)
            result += line;
        inputStream.close();
}
}
