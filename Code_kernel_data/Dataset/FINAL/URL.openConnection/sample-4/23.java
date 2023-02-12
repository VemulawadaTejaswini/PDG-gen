public class func{
public void resetStream(){
    conn = (new URL(url)).openConnection();
    stream = new DataInputStream(new BufferedInputStream(
      conn.getInputStream(), RandomAccessInputStream.MAX_OVERHEAD));
    length = conn.getContentLength();
    if (stream != null) stream.mark(RandomAccessInputStream.MAX_OVERHEAD);
}
}
