//6
public class func{
public void startKeyGen(){
    Thread keyGenThread = new Thread(mKeyGen);
    keyGenThread.setName("KeyGen");
    keyGenThread.start();
}
}
