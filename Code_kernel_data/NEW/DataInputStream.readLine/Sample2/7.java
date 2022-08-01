//6
public class func{
	public void receive(InputStream is){
    int code = is.read();
    if (code == -1) {
      throw new EOFException();
    }
    switch (code) {
      case StatusReply.MARKER: {
        return new StatusReply(new DataInputStream(is).readLine());
      }
      case ErrorReply.MARKER: {
        return new ErrorReply(new DataInputStream(is).readLine());
      }
      case IntegerReply.MARKER: {
        return new IntegerReply(readLong(is));
      }
      case BulkReply.MARKER: {
        return new BulkReply(readBytes(is));
      }
      case MultiBulkReply.MARKER: {
        return new MultiBulkReply(is);
      }
      default: {
        throw new IOException("Unexpected character in stream: " + code);
      }
    }
}
}
