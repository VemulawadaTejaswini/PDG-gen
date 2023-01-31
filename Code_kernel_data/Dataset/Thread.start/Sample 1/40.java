//39
public class func{
	public void Tee(Socket s){
      Thread t = new Thread(this);
      t.setDaemon(true);
      t.start();
}
}
