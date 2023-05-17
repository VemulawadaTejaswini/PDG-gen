//3
public class func{
public void printInitialStats(Logger LOG,int thisTaskID,int firstRelationSize,int firstTaggedRelationSize,int secondRelationSize,int secondTaggedRelationSize){
  final Runtime runtime = Runtime.getRuntime();
  final long memory = runtime.totalMemory() - runtime.freeMemory();
  LOG.info(","
    + "INITIAL,"
    + thisTaskID
    + ",:"
    + "TimeStamp:,"
    + dateFormat.format(Calendar.getInstance().getTime())
    + ", FirstStorage:,"
    + (firstRelationSize + firstTaggedRelationSize)
    + ", SecondStorage:,"
    + (secondRelationSize + secondTaggedRelationSize)
    + ", Total:,"
    + (firstRelationSize + secondRelationSize
      + firstTaggedRelationSize + secondTaggedRelationSize)
    + ", Memory used: ," + bytesToMegabytes(memory) + ","
    + bytesToMegabytes(runtime.totalMemory()));
}
}
