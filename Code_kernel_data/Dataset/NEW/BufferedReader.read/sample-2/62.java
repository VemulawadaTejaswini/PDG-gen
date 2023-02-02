//62
public class func{
public void read(InputStream stream){
        int chars = reader.read(cbuf);
        if (chars == -1) {
          break;
        }
        sb.append(cbuf, 0, chars);
      return sb.toString();
}
}
