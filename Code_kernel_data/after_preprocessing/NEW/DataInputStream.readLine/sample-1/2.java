//2
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
                    ; // what would we want to do in this case??
                bytesLeft =
                    Integer.parseInt(line.substring(key.length()).trim());
                contentLengthFound = true;
            }

            // The idea here is to go past the first blank line.
            // Some DataInputStream.readLine() documentation specifies that
            // it does include the line-terminating character(s) in the
            // returned string, but it actually doesn't, so we'll cover
            // all cases here...
        } while ((line.length() != 0) &&
                 (line.charAt(0) != '\r') && (line.charAt(0) != '\n'));
        if (!contentLengthFound || bytesLeft < 0) {
            // This really shouldn't happen, but if it does, shoud we fail??
            // For now, just give up and let a whole lot of bytes through...
            bytesLeft = Integer.MAX_VALUE;
        }
}
}
