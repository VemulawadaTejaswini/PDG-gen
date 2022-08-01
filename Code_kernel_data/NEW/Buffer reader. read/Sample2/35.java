//34
public class func{
	public void readErrorPage(HttpURLConnection connection){
          int chars = reader.read(cbuf);
          if (chars == -1) {
            break;
          }
          sb.append(cbuf, 0, chars);
          if (sb.length()== 0) {
            return null;
          }
      return sb.toString();
}
}
