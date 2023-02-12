public class func{
public void parseAwfulCSV(BufferedReader reader,boolean header){
        if (ch == '\"') {
          reader.mark(1);
          if (reader.read() == '\"') {
            if (count == c.length) {
              c = PApplet.expand(c);
            }
            c[count++] = '\"';
          } else {
            reader.reset();
            insideQuote = false;
          }
        } else {  // inside a quote, but the character isn't a quote
          if (count == c.length) {
            c = PApplet.expand(c);
          }
          c[count++] = (char) ch;
        }
}
}
