public class func{
public void copyFile(File src,File dst,IProject project){
        buffer = ByteBuffer.allocate(1024);
        while (in.read(buffer) != -1) {
          buffer.flip();
          out.write(buffer);
          buffer.clear();
        }
        if (in != null) {
          in.close();
        }
}
}
