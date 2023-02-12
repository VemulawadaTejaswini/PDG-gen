public class func{
public void readFile(final File file){
    final FileChannel channel = new FileInputStream(file).getChannel();
    final long bytesTotal = channel.size();
    final ByteBuffer buffer = ByteBuffer.allocateDirect((int)bytesTotal);
    do {
      bytesRead += channel.read(buffer);
    } while ( bytesRead < bytesTotal );
    buffer.flip();
}
}
