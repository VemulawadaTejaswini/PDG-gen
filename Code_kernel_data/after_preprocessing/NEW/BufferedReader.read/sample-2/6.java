//6
public class func{
public void readUntilDelimiter(final BufferedReader inputStream){
      ci = inputStream.read();
      if (ci == -1) {
        System.err.println("Socket already closed by server \n");
        inputStream.close();
        throw new IOException();
      } else {
        c = (char) ci;
        if (c == '#' && canc == false) { // Found first #
          response.append(c);
          canc = true;
        } else if (c == '#') { // Found second # command terminated
                    // correctly EXIT
          response.append(c);
          break;
        } else if (c != '#') { // Append char and start again finding
                    // the first #
          response.append(c);
          canc = false;
        }
      }
    return response.toString();
}
}
