//6
public class func{
	public void onCliPortConnectionEstablished(){
        Thread listeningThread = new ListeningThread(socketRef.get(),
                                                     currentConnectionGeneration.incrementAndGet());
        listeningThread.start();
}
}
