public class func{
public void readLines(final InputStream is2,final String encoding){
                int c = reader.read();
                if (c == -1) {
                    break;
                }
                sb.append((char) c);
                if (c == '\r') {
                    c = reader.read();
                    if (c == -1) {
                        break;
                    }
                    sb.append((char) c);
                    if (c == '\n') {
                        list.add(sb.toString());
                        sb = new StringBuffer();
                    }
                } else if (c == '\n') {
                    list.add(sb.toString());
                    sb = new StringBuffer();
                }
}
}
