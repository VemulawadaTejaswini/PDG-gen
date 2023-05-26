public class func{
public void execute(Runnable command){
        new Thread(command).start();
}
}
