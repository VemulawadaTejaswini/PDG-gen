public class func{
public void startBalancer(){
    if(balancer == null) {
      balancer = new Balancer();
      Thread balancerThread = new Thread(threadGroup, balancer);
      balancerThread.start();
    } else {
      LOG.info("Balancer already started");
      return;
    }
}
}
