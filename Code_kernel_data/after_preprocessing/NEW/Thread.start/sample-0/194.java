//194
public class func{
public void testThread(){
    sdb.option(SdbPersistenceManager.CONSISTENT_READ, PmOptionStickiness.STICKY);
      MyOptionRunner r = new MyOptionRunner(sdb, true);
    Thread t = new Thread(r);
    t.start();
    t.wait(1000);
}
}
