public class dummy {
private byte[] getMessageBytes(final HttpServletRequest req)
            throws IOException {
        if (req.getMethod().equals(POST)) {
            return IOUtils.toByteArray(req.getInputStream());
        } else {
            Operation op = getOperation(req);
            if (op == Operation.PKI_OPERATION) {
                String msg = req.getParameter(MSG_PARAM);
                if (msg.length() == 0) {
                    return new byte[0];
                }
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.debug("Decoding {}", msg);
                }
                return Base64.decode(msg);
            } else {
                return new byte[0];
            }
        }
    }
}