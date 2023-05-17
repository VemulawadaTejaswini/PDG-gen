public class func{
public void readBase(final BufferedReader r){
      r.mark(1);
      int c = r.read();
      if (c < 0) {
        throw new IOException("Unexpected end of config file.");
      } else if (']' == c) {
        r.reset();
        break;
      } else if (' ' == c || '\t' == c) {
        for (;;) {
          r.mark(1);
          c = r.read();
          if (c < 0) {
            throw new IOException("Unexpected end of config file.");
          } else if ('"' == c) {
            r.reset();
            break;
          } else if (' ' == c || '\t' == c) {
          } else {
            throw new IOException("Bad base entry. : " + base + "," + c);
          }
        }
        break;
      } else if (Character.isLetterOrDigit((char) c) || '.' == c || '-' == c) {
        base.append((char) c);
      } else {
        throw new IOException("Bad base entry. : " + base + ", " + c);
      }
    return base.toString();
}
}
