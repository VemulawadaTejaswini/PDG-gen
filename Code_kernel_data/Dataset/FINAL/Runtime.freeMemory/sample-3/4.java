public class func{
public void printMemoryStats(int heirarchyPosition,Logger LOG,int thisTaskID,long numberOfTuplesMemory,int firstRelationSize,int firstTaggedRelationSize,int secondRelationSize,int secondTaggedRelationSize){
    final Runtime runtime = Runtime.getRuntime();
    final long memory = runtime.totalMemory()
      - runtime.freeMemory();
    LOG.info(","
      + "MEMORY,"
      + thisTaskID
      + ",:"
      + "TimeStamp:,"
      + dateFormat.format(Calendar.getInstance().getTime())
      + ", FirstStorage:,"
      + (firstRelationSize + firstTaggedRelationSize)
      + ", SecondStorage:,"
      + (secondRelationSize + secondTaggedRelationSize)
      + ", Total:,"
      + (numberOfTuplesMemory)
      + ", Memory used: ,"
      + StatisticsUtilities.bytesToMegabytes(memory)
      + ","
      + StatisticsUtilities.bytesToMegabytes(runtime
        .totalMemory()));
}
}
