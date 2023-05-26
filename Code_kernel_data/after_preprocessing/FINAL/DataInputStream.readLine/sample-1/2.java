public class func{
public void HttpInputStream(InputStream in){
        do {
            line = dis.readLine();
            if (RMIMasterSocketFactory.proxyLog.isLoggable(Log.VERBOSE)) {
                RMIMasterSocketFactory.proxyLog.log(Log.VERBOSE,
                    "received header line: \"" + line + "\"");
            }
            if (line == null)
                throw new EOFException();
            if (line.toLowerCase().startsWith(key)) {
                if (contentLengthFound)
                    ;
                bytesLeft =
                    Integer.parseInt(line.substring(key.length()).trim());
                contentLengthFound = true;
            }
        } while ((line.length() != 0) &&
                 (line.charAt(0) != '\r') && (line.charAt(0) != '\n'));
        if (!contentLengthFound || bytesLeft < 0) {
            bytesLeft = Integer.MAX_VALUE;
        }
}
}
