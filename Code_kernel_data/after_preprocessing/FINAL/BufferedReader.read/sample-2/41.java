public class func{
public void getInputStreamAsCharArray(InputStream stream,int length,String encoding){
        int current = reader.read();
        if (current < 0) break;
        amountRequested = Math.max(stream.available(), DEFAULT_READING_SIZE);
        if (totalRead + 1 + amountRequested > contents.length)
          System.arraycopy(contents,   0,   contents = new char[totalRead + 1 + amountRequested], 0, totalRead);
}
}
