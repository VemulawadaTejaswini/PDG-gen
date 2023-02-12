public class func{
public void executeOnSlave(){
            long initPos = fileChannel.position();
            String key = Integer.toString(slaveState.getSlaveIndex()) + "-" + Long.toString(initPos);
            int bytesRead = fileChannel.read(buffer);
            if (bytesRead != -1) {
               while (bytesRead != valueSize) {
                  int readBytes = fileChannel.read(buffer);
                  if (readBytes == -1) {
                     break;
                  } else {
                     bytesRead += readBytes;
                  }
               }
               totalBytesRead += bytesRead;
               if (putCount % 5000 == 0) {
                  log.info("Writing " + bytesRead + " bytes to cache key: " + key + " at position "
                        + fileChannel.position());
               }
               buffer.rewind();
               long start = System.nanoTime();
               if (stringData) {
                  String cacheData = buffer.asCharBuffer().toString();
                  start = System.nanoTime();
                  cache.put(key, cacheData);
               } else {
                  cache.put(key, buffer.array());
               }
               if (printWriteStatistics) {
                  log.info("Put on slave-" + slaveState.getSlaveIndex() + " took "
                        + Utils.prettyPrintTime(System.nanoTime() - start, TimeUnit.NANOSECONDS));
               }
               putCount++;
               fileChannel.position(initPos + (valueSize * totalWriters));
               buffer.clear();
            } else {
               file.close();
               file = null;
               break;
            }
         return new ResultAck(slaveState, putCount, totalBytesRead);
}
}
