//331
public class func{
	public void collectAll(){
     Thread thread = new Thread(){
       public void run(){
         logger.info("begin disposal");
         collectExpired();
         collectLFU();
         logger.info("disposal complete");
       }
     };
     thread.start();
}
}
