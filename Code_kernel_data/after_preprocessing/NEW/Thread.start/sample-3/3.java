//3
public class func{
public void Player(){
        Buffer buffer = new Buffer(BUFFER_SIZE);
        playingThread = new PlayingThread(this, buffer);
        Thread t1 = new Thread(playingThread, "Playing Thread");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
}
}
