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
        } else {
          if (count == c.length) {
            c = PApplet.expand(c);
          }
          c[count++] = (char) ch;
        }
}
}
