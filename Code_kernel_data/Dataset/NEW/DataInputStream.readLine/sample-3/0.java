//0
public class func{
public void readLine(){
    return new DataInputStream(new InputStream() {
      @Override
      public int read() throws IOException {
        ensureAvailable(1);
        return buffer[position++];
      }
    }).readLine();
}
}
