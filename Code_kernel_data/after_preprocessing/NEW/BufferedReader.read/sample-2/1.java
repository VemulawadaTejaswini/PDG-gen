//1
public class func{
public void readLines(InputStream is2,String encoding){
        int c= reader.read();
        if (c == -1)
          break;
        sb.append((char)c);
        if (c == '\r') {  // single CR or a CR followed by LF
          c= reader.read();
          if (c == -1)
            break;
          sb.append((char)c);
          if (c == '\n') {
            list.add(sb.toString());
            sb= new StringBuffer();
          }
        } else if (c == '\n') {  // a single LF
          list.add(sb.toString());
          sb= new StringBuffer();
        }
}
}
