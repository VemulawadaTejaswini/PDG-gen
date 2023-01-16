//11
public class func{
	public void readName(final BufferedReader r){
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
            // Skipped...
          } else {
            throw new IOException("Bad entry delimiter.");
          }
}
}
