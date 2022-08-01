//145
public class func{
	public void readContent(GetMethod get){
            Reader input = new InputStreamReader(get.getResponseBodyAsStream(), get.getResponseCharSet());
            BufferedReader bufferedReader = (input instanceof BufferedReader) ? (BufferedReader) input
                : new BufferedReader(input);
            while ((charsRead = bufferedReader.read(buffer)) != -1) {
                result.append(buffer, 0, charsRead);
            }
            result.append(get.getResponseBodyAsString());
        return result.toString();
}
}
