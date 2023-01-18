//26
public class func{
	public void readEntirelyAsString(AtmosphereResource r){
                    Reader reader = request.getReader();
                    if (reader != null) {
                        bufferedReader = new BufferedReader(reader);
                    }
                if (bufferedReader != null) {
                    char[] charBuffer = new char[8192];
                    int bytesRead = -1;
                    try {
                        while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                            stringBuilder.append(charBuffer, 0, bytesRead);
                        }
                    } catch (NullPointerException ex) {
                        // https://java.net/jira/browse/GRIZZLY-1676
                    }
                } else {
                    stringBuilder.append("");
                }
}
}
