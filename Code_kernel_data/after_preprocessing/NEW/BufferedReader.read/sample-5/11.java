//11
public class func{
public void skipWhitespace(BufferedReader reader){
            int ch = reader.read();
            while (ch >= 0) {
                if (!Character.isWhitespace(ch)) {
                    return ch;
                }
                ch = reader.read();
            }
}
}
