public class func{
public void automatic(){
      Runtime rt = Runtime.getRuntime();
      final long max = rt.maxMemory();
      final long total = rt.totalMemory();
      final long free = rt.freeMemory();
      if (sortBufferByteSize <  minBufferSizeBytes
          || totalAvailableBytes > 10 * minBufferSizeBytes) {
        if (totalAvailableBytes/2 > minBufferSizeBytes){
          sortBufferByteSize = totalAvailableBytes/2;
        } else {
          sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
      }
}
}
