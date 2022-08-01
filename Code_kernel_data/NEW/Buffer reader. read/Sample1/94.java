//93
public class func{
	public void parseAwfulCSV(BufferedReader reader,boolean header){
    while ((ch = reader.read()) != -1) {
      if (insideQuote) {
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
      } else {  // not inside a quote
        if (ch == '\"') {
          insideQuote = true;

        } else if (ch == '\r' || ch == '\n') {
          if (ch == '\r') {
            // check to see if next is a '\n'
            reader.mark(1);
            if (reader.read() != '\n') {
              reader.reset();
            }
          }
          setString(row, col, new String(c, 0, count));
          count = 0;
          if (row == 0 && header) {
            // Use internal row removal (efficient because only one row).
            removeTitleRow();
            // Un-set the header variable so that next time around, we don't
            // just get stuck into a loop, removing the 0th row repeatedly.
            header = false;
          }
          row++;
          col = 0;

        } else if (ch == ',') {
          setString(row, col, new String(c, 0, count));
          count = 0;
          // starting a new column, make sure we have room
          col++;
          ensureColumn(col);

        } else {  // just a regular character, add it
          if (count == c.length) {
            c = PApplet.expand(c);
          }
          c[count++] = (char) ch;
        }
      }
    }
}
}
