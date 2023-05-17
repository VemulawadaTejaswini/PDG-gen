public class func{
public void sendAction(String action){
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        if (conn.getResponseCode() != HttpServletResponse.SC_OK) {
            throw new IOException("Bad status: " + conn.getResponseCode() + " for action: "
                    + action);
        }
}
}
