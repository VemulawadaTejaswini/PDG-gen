//7
public class func{
	public void readFully(Reader reader){
      while ((bytes_read = in.read(cbuf, 0, 1024)) != -1) {
        sb.append(cbuf, 0, bytes_read);
      }
      return sb.toString();
}
}
