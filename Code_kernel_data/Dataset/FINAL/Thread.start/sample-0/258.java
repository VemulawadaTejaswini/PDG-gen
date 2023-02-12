public class func{
public void execute(Runnable r){
      Thread t = new Thread(r);
      t.start();
}
}
