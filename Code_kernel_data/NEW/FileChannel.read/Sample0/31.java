//30
public class func{
	public void readFromFile(FileChannel fileChannel,int bytesToRead){
      ByteBuffer nioBuffer = ByteBuffer.wrap(rawBuffer);
      for (int bytesRead = 0; bytesRead < bytesToRead;) {
        int lastBytesRead = fileChannel.read(nioBuffer);

        // We always expect to read data.
        if (lastBytesRead < 0) {
          throw new OsmosisRuntimeException("Unexpectedly reached the end of the replication data file");
        }
        if (lastBytesRead == 0) {
          throw new OsmosisRuntimeException("Last read of the replication data file returned 0 bytes");
        }

        bytesRead += lastBytesRead;
      }
      return ChannelBuffers.wrappedBuffer(rawBuffer);
}
}
