//37
public class func{
public void main(String[] args){
        Thread clientThread = new Thread(new BinaryLightClient());
        clientThread.setDaemon(false);
        clientThread.start();
}
}
