public class func{
public void copy2null(FileChannel in,int buffersize){
      int n = in.read(buffer);
      if (n == -1) break;
      buffer.flip();
}
}
