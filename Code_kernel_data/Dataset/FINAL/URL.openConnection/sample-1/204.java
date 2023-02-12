public class func{
public void postTokenEndpoint(String payload){
        HttpsURLConnection connection = (HttpsURLConnection) new URL(TOKEN_URL).openConnection();
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        final OutputStream os = connection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
        writer.write(payload);
        writer.flush();
        writer.close();
}
}
