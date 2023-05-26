public class func{
public void test_all_makeLogsSeriallySlowly(int numToGenerate,Handler handler){
      LogGenerator generator = new LogGenerator(numToGenerate, handler, 1000);
      String tName = handler.getClass().getSimpleName() + ".UnitTest_LogGenerator";
      Thread thread = new Thread( generator, tName );
      thread.setPriority( Thread.NORM_PRIORITY );
      thread.start();
}
}
