//17
public class func{
	public void run(){
              Runtime rt = Runtime.getRuntime();
              long freeMemory = rt.freeMemory();
              long totalMemory = rt.totalMemory();
              long maxMemory = rt.maxMemory();
              if (FORCE_GC_MEMORY_EVENTS ||
                  freeMemory / (totalMemory * 1.0) < GC_MEMORY_THRESHOLD) {
                forceBatchExpiration = !this.batchExpirationInProgress &&
                       this.expiredTombstones.size() > (EXPIRED_TOMBSTONE_LIMIT / 4);
                if (forceBatchExpiration) {
                  if (logger.isDebugEnabled()) {
                    logger.debug("forcing batch expiration due to low memory conditions");
                  }
                }
                // forcing expiration of tombstones that have not timed out can cause inconsistencies
                // too easily
  //              if (this.batchMode) {
  //                forceExpirationCount = EXPIRED_TOMBSTONE_LIMIT - this.expiredTombstones.size();
  //              } else {
  //                forceExpirationCount = EXPIRED_TOMBSTONE_LIMIT;
  //              }
  //              maximumSleepTime = 1000;
              }
}
}
