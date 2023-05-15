public class dummy {
public <T> T sendRequest(final Request msg,
            final ScepResponseHandler<T> handler) throws TransportException {
        if (!PkiOperationRequest.class.isAssignableFrom(msg.getClass())) {
            throw new IllegalArgumentException(
                    "POST transport may not be used for " + msg.getOperation()
                            + " messages.");
        }
        URL url = getUrl(msg.getOperation());
        HttpURLConnection conn;
        try {
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/octet-stream");
        } catch (IOException e) {
            throw new TransportException(e);
        }
        conn.setDoOutput(true);
        byte[] message;
        try {
            message = Base64.decode(msg.getMessage().getBytes(
                    Charsets.US_ASCII.name()));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        OutputStream stream = null;
        try {
            stream = new BufferedOutputStream(conn.getOutputStream());
            stream.write(message);
        } catch (IOException e) {
            throw new TransportException(e);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException e) {
                    LOGGER.error("Failed to close output stream", e);
                }
            }
        }
        try {
            int responseCode = conn.getResponseCode();
            String responseMessage = conn.getResponseMessage();
            LOGGER.debug("Received '{} {}' when sending {} to {}",
                    varargs(responseCode, responseMessage, msg, url));
            if (responseCode != HttpURLConnection.HTTP_OK) {
                throw new TransportException(responseCode + " "
                        + responseMessage);
            }
        } catch (IOException e) {
            throw new TransportException("Error connecting to server.", e);
        }
        byte[] response;
        try {
            response = IOUtils.toByteArray(conn.getInputStream());
        } catch (IOException e) {
            throw new TransportException("Error reading response stream", e);
        }
        return handler.getResponse(response, conn.getContentType());
    }
}