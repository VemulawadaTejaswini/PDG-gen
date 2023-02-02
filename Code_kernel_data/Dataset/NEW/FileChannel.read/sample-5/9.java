//9
public class func{
public void loadBuffer(FileChannel indexFile,long offset,int occupiedSpace){
      ByteBuffer buffer = ByteBuffer.allocate(occupiedSpace);
      do {
         int nowRead = indexFile.read(buffer, offset + read);
         if (nowRead < 0) {
            throw new IOException("Cannot read record [" + offset + ":" + occupiedSpace + "] (already read "
                  + read + "), file size is " + indexFile.size());
         }
         read += nowRead;
      } while (read < occupiedSpace);
      buffer.rewind();
}
}
