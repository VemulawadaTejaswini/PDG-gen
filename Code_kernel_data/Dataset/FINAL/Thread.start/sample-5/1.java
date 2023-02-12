public class func{
public void runThreadByLimitedTime(long limitTime,Thread testThread){
    testThread.start();
    testThread.join(limitTime);
    if (testThread.isAlive()) {
      testThread.interrupt();
      fail("timeout by " + limitTime / 1000 + " seconds"); //$NON-NLS-2$
    } else {
    }
}
}
