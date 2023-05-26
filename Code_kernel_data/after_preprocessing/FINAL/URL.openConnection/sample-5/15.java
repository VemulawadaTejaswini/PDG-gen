public class func{
public void postMultipartRequest(String endpoint){
    mUrlConnection = (HttpsURLConnection) ( new URL(endpoint)).openConnection();
    mUrlConnection.setDoOutput(true);
    mUrlConnection.setRequestMethod("POST");
    mUrlConnection.setDoInput(true);
    mUrlConnection.setRequestProperty("Authorization", "Bearer " + mAccessToken);
    mUrlConnection.connect();
    mOutputStream = mUrlConnection.getOutputStream();
}
}
