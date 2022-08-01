//18
public class func{
	public void checkFor(String str,BufferedReader b,BufferedWriter o){
      b.mark(str.length()+1);
      char[] buffer = new char[str.length()];
      int read = b.read(buffer);
      if (read == -1) {
        b.reset();
        return false;
      }
      if (new String(buffer, 0, read).toLowerCase().equals(str.toLowerCase())) {
        if (o != null) o.write(buffer, 0, read);
        return true;
      } else {
        b.reset();
        return false;
      }
        b.reset();
}
}
