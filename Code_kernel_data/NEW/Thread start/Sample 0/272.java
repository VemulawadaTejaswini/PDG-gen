//271
public class func{
	public void operationComplete(final FutureDone<Message> future){
                final Thread holePunchScheduler = new Thread(new HolePScheduler(peer.peerBean().holePNumberOfPunches(), thisInstance));
                holePunchScheduler.start();
}
}
