public class func{
public void prependNewline(File file){
        FileChannel channel = raf.getChannel();
        channel.position(length - 1);
        if (channel.read(buffer) > 0) {
          buffer.rewind();
          prepend = buffer.get() != '\n';
        }
        raf.close();
}
}
