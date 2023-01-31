//38
public class func{
	public void parseAwfulCSV(BufferedReader reader,boolean header){
        if (ch == '\"') {
          // this is either the end of a quoted entry, or a quote character
          reader.mark(1);
          if (reader.read() == '\"') {
            // it's "", which means a quote character
            if (count == c.length) {
              c = PApplet.expand(c);
            }
            c[count++] = '\"';
          } else {
            // nope, just the end of a quoted csv entry
            reader.reset();
            insideQuote = false;
            // TODO nothing here that prevents bad csv data from showing up
            // after the quote and before the comma...
//            set(row, col, new String(c, 0, count));
//            count = 0;
//            col++;
//            insideQuote = false;
          }
        } else {  // inside a quote, but the character isn't a quote
          if (count == c.length) {
            c = PApplet.expand(c);
          }
          c[count++] = (char) ch;
        }
}
}
