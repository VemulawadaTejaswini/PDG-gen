public class dummy {

public <T> T sendRequest(final Request msg,
            final ScepResponseHandler<T> handler) throws TransportException {
        URL url = getUrl(msg.getOperation(), msg.getMessage());
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Sending {} to {}", msg, url);
        }
        HttpURLConnection conn;
        try {
            conn = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            throw new TransportException(e);
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
            throw new TransportException("Error connecting to server", e);
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