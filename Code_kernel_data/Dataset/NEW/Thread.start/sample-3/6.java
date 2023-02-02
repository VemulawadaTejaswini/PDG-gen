//6
public class func{
public void quit(){
    Thread thread = new Thread(this, "Quit");
    thread.setPriority(Thread.NORM_PRIORITY);
    thread.start();
}
}
