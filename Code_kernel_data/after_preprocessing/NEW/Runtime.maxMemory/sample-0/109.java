//109
public class func{
public void cleanMemory(String message,int count){
      runtime.runFinalization();
      runtime.gc();
      allocatedMemory = runtime.totalMemory();
      freeMemory = runtime.freeMemory();
      if (after == allocatedMemory - freeMemory) break;
    long maxMemory = runtime.maxMemory();
    if ((after - before) > (1024 * 1024)) logger.debug(message + ": used "
        + dFormat.format((double) (after - before) / (double) (1024 * 1024)) + " MB for "
        + dFormat.format(count) + " objects, " + Math.round((double) (after - before) / (double) count)
        + " Bytes per object, " + (timestampAfter - timestampBefore) + " milliseconds, "
        + dFormat.format(Math.round((double) count * 1000 / (double) (timestampAfter - timestampBefore + 1)))
        + " objects per second");
    else
      logger.debug(message
          + ": used "
          + dFormat.format((double) (after - before) / (double) 1024)
          + " KB for "
          + dFormat.format(count)
          + " objects, "
          + Math.round((double) (after - before) / (double) count)
          + " Bytes per object, "
          + (timestampAfter - timestampBefore)
          + " milliseconds, "
          + dFormat.format(Math
              .round((double) count * 1000 / (double) (timestampAfter - timestampBefore + 1)))
          + " objects per second");
}
}
