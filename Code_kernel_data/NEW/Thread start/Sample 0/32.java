//31
public class func{
	public void main(String[] args){
        Thread thread = new Thread(group, new TestDesignTime());
        thread.start();
        thread.join();
}
}
