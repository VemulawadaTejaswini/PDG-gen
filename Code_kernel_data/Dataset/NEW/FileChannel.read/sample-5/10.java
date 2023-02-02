//10
public class func{
public void loadPage(PageWindow window){
        ByteBuffer buffer = ByteBuffer.allocate(window.getFilePartSize());
          channel.read(buffer, window.getFilePartOffset());
          if (buffer.hasArray())
          {
            result = buffer.array();
          }
}
}
