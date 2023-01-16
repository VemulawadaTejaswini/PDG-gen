//182
public class func{
	public void Player(){
        bufferingThread = new BufferingThread(buffer, playingThread);
        new Thread(bufferingThread, "Buffer Thread").start();
}
}
