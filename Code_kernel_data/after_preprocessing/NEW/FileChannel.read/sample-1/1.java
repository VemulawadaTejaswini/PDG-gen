//1
public class func{
public void copyFile(File src,File dst,IProject project){
        buffer = ByteBuffer.allocate(1024);
        while (in.read(buffer) != -1) {
          buffer.flip(); // Prepare for writing
          out.write(buffer);
          buffer.clear(); // Prepare for reading
        }
        if (in != null) {
          in.close();
        }
}
}
