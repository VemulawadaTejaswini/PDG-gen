//68
public class func{
	public void init(){
        for (int i = 0; i < 12; i++) {
            Dequeuer dequeuer = new Dequeuer(i);
            Thread t = new Thread(dequeuer);
            t.start();
        }
}
}
