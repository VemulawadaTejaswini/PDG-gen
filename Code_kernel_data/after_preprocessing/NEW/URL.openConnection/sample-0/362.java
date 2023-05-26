//362
public class func{
public void deleteFile(ActiveMQBlobMessage message){
        URL url = createMessageURL(message);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("DELETE");
        connection.connect();
        connection.disconnect();
        if (!isSuccessfulCode(connection.getResponseCode())) {
            throw new IOException("DELETE was not successful: " + connection.getResponseCode() + " "
                                  + connection.getResponseMessage());
        }
}
}
