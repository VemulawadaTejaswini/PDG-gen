//19
public class func{
public void automatic(){
      Runtime rt = Runtime.getRuntime();
      final long max = rt.maxMemory(); // max allocated
      final long total = rt.totalMemory(); // currently allocated
      final long free = rt.freeMemory(); // unused portion of currently allocated
      if (sortBufferByteSize <  minBufferSizeBytes
          || totalAvailableBytes > 10 * minBufferSizeBytes) { // lets see if we need/should to grow the heap 
        if (totalAvailableBytes/2 > minBufferSizeBytes){ // there is enough mem for a reasonable buffer
          sortBufferByteSize = totalAvailableBytes/2; // grow the heap
        } else {
          //heap seems smallish lets be conservative fall back to the free/2 
          sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
      }
}
}
