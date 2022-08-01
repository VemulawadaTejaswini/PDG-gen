//18
public class func{
	public void perform(){
        URL checkDebugURL = new URL(query);
        final URLConnection debugConnection = checkDebugURL
            .openConnection();
        debugConnection.setReadTimeout(DEFAULT_TIMEOUT);
        inputStream = debugConnection.getInputStream();
        if (inputStream != null) {
          inputStream.close();
        }
}
}
