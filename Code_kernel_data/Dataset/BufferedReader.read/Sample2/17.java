//16
public class func{
	public void readLine(BufferedReader inReader2){
        if (inReader2.ready()) {
          int c = inReader2.read();
          if (c == '\n') {
            return str.toString();
          }
          if (c != '\r') {
            str.append((char)c);
          }
        } else {
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {
            throw new InterruptedIOException();
          }
        }
}
}
