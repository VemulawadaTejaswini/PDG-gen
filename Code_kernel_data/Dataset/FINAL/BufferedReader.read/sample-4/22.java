public class func{
public void outPutChar(Writer out,BufferedReader buffer){
    while ((ch = buffer.read()) != -1) {
      charr = (char) ch;
      switch (ch) {
        case '%':
          if (para == 0) {
            buffer.readLine();
          } else {
            out.write(charr);
          }
        case '\n':
          if (last == 1) {
            out.write("");
            out.write('\n');
            last = 0;
          }
          break;
        case '(':
          if (para++ > 0) {
            out.write(charr);
          }
          break;
        case ')':
          if (para-- > 1) {
            out.write(charr);
          } else {
            out.write(' ');
          }
          last = 1;
          break;
        case '\\':
          if (para > 0)
            switch (charr = (char) buffer.read()) {
              case '(':
              case ')':
                out.write(charr);
                break;
              case 't':
                out.write('\t');
                break;
              case 'n':
                out.write('\n');
                break;
              case '\\':
                out.write('\\');
                break;
              case '0':
              case '1':
              case '2':
              case '3':
              case '4':
              case '5':
              case '6':
              case '7':
                out.write('\\');
              default:
                out.write(charr);
                break;
            }
          break;
        default:
          if (para > 0) {
            out.write(charr);
          }
      }
    }
}
}
