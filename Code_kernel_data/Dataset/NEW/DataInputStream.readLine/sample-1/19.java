//19
public class func{
public void readHeader(DataInputStream in){
        buf = in.readLine();
        if (buf == null) {
          throw new IOException("Unexpected EOF reading header");
        }
}
}
