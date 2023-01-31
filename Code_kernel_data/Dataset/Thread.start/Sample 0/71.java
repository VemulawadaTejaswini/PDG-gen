//70
public class func{
	public void createEdits(int nEdits){
      Thread t = new Thread(new ClientThread());
      t.start();
      threads.add(t);
}
}
