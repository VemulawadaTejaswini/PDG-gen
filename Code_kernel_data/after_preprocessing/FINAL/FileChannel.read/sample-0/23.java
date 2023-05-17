public class func{
public void write(OutputStream out){
            bb.clear();
            long bytesRead = channel.read(bb);
            if (bytesRead <= 0) {
              writeNothing();
              fos.close();
              break;
            }
            fos.writeInt((int) bytesRead);
            if (useChecksum) {
              checksum.reset();
              checksum.update(buf, 0, (int) bytesRead);
              fos.writeLong(checksum.getValue());
            }
}
}
