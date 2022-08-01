//37
public class func{
	public void read(){
      if (size > buffer.getMemorySegment().size()) {
        throw new IllegalStateException("Buffer is too small for data: " + buffer.getMemorySegment().size() + " bytes available, but " + size + " needed. This is most likely due to an serialized event, which is larger than the buffer size.");
      }
      buffer.setSize(size);
      fileChannel.read(buffer.getNioBuffer());
      if (!isBuffer) {
        buffer.tagAsEvent();
      }
}
}
