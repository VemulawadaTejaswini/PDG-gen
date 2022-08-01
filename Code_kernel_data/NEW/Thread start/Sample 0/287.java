//286
public class func{
	public void deleteEntry(int dataid){
    Thread thread = new Thread(new DeleteEntry(dataid));
    thread.start();
}
}
