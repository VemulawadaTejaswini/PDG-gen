//76
public class func{
	public void readCharNonBlocking(BufferedReader reader){
      if (reader.ready()) {
        return reader.read();
      } else {
        return -1;
      }
}
}
