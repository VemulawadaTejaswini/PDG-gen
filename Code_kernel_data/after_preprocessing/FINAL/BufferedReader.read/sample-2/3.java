public class func{
public void readName(final BufferedReader r){
      r.mark(1);
      int c = r.read();
      if (c < 0) {
        throw new IOException("Unexpected end of config file.");
      } else if ('=' == c) {
        break;
      } else if (' ' == c || '\t' == c) {
        for (;;) {
          r.mark(1);
          c = r.read();
          if (c < 0) {
            throw new IOException("Unexpected end of config file.");
          } else if ('=' == c) {
            break;
          } else if (';' == c || '#' == c || '\n' == c) {
            r.reset();
            break;
          } else if (' ' == c || '\t' == c) {
          } else {
            throw new IOException("Bad entry delimiter.");
          }
        }
        break;
      } else if (Character.isLetterOrDigit((char) c) || c == '-') {
        name.append((char) c);
      } else if ('\n' == c) {
        r.reset();
        name.append((char) c);
        break;
      } else {
        throw new IOException("Bad config entry name: " + name + (char) c);
      }
    return name.toString();
}
}
