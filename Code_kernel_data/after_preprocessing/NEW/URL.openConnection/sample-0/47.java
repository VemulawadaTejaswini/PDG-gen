//47
public class func{
public void verifyThatUrlIsHudson(Candidate target){
            HttpURLConnection con = (HttpURLConnection) new URL(target.url).openConnection();
            con.connect();
            if (con.getResponseCode() == HttpURLConnection.HTTP_FORBIDDEN) {
                throw new RetryException(
                        "This jenkins server requires Authentication!.");
            }
            String v = con.getHeaderField("X-Hudson");
            if (v == null) {
                throw new RetryException("This URL doesn't look like Jenkins.");
            }
            throw new RetryException("Failed to connect to " + target.url, e);
}
}
