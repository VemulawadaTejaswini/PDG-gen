//137
public class func{
	public void call(WorkflowStore store){
        if (url != null) {
            try {
                URL url = new URL(this.url);
                HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
                if (urlConn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    handleRetry();
                }
            }
            catch (IOException ex) {
                handleRetry();
            }
        }
}
}
