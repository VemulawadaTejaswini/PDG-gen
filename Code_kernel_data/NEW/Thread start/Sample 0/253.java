//252
public class func{
	public void scanFirst(){
    Thread first = new Thread(new FirstFsScanRunnable(this.gui.getFsDiffFirstTree()));
    first.start();
}
}
