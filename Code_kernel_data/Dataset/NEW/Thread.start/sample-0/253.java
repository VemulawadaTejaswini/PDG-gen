//253
public class func{
public void cleanupAndRollOver(){
    Thread clth = new Thread(new CleanUpThread());
    clth.start();
}
}
