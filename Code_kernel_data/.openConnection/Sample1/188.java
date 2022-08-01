//187
public class func{
	public void getCertificates(String url){
            URL destinationURL = new URL(url);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) destinationURL.openConnection();
            httpsURLConnection.connect();
            return httpsURLConnection.getServerCertificates();
}
}
