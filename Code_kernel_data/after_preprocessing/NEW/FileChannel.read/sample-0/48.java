//48
public class func{
public void write(OutputStream out){
            bb.clear();
            long bytesRead = channel.read(bb);
            if (bytesRead <= 0) {
              writeNothingAndFlush();
              fos.close();
              break;
            }
            fos.writeInt((int) bytesRead);
}
}
