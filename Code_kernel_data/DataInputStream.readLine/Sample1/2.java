//1
public class func{
	public void execute(String param){
        do {
            try {
                line = socketIn.readLine();
            } catch (IOException e) {
                throw new CGIServerException("error reading from server");
            }
            if (line == null)
                throw new CGIServerException(
                    "unexpected EOF reading server response");

            if (line.toLowerCase().startsWith(key)) {
                if (contentLengthFound)
                    ; // what would we want to do in this case??
                responseContentLength =
                    Integer.parseInt(line.substring(key.length()).trim());
                contentLengthFound = true;
            }
        } while ((line.length() != 0) &&
                 (line.charAt(0) != '\r') && (line.charAt(0) != '\n'));
        if (!contentLengthFound || responseContentLength < 0)
            throw new CGIServerException(
                "missing or invalid content length in server response");
            socketIn.readFully(buffer);
}
}
