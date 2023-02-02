//176
public class func{
public void pipe(BufferedReader br){
    StringBuffer sb = new StringBuffer (BUFSIZE);
    do {
      count = br.read (buf, 0, BUFSIZE);
      sb.append (buf);
    } while (count == BUFSIZE);
    lexer.setCharSequence ((CharSequence)sb);
}
}
