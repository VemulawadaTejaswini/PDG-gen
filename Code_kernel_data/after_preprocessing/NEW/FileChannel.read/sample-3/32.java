//32
public class func{
public void copyFromChannel(FileChannel channel,TableStats stats){
      buffer.clear();
      channel.read(buffer);
      memorySize = buffer.position();
      while (position < memorySize) {
        long recordPtr = address + position;

        if (remain() < SizeOf.SIZE_OF_INT) {
          channel.position(channel.position() - remain());
          memorySize = (int) (memorySize - remain());
          return true;
        }

        int recordSize = UNSAFE.getInt(recordPtr);

        if (remain() < recordSize) {
          channel.position(channel.position() - remain());
          memorySize = (int) (memorySize - remain());
          return true;
        }

        position += recordSize;
        rowNum++;
      }
}
}
