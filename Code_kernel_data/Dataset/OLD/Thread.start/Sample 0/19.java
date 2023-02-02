//18
public class func{
	public void main(String[] args){
        ThreadGroup group = new ThreadGroup("$$$"); // NON-NLS: unique thread name
        Thread thread = new Thread(group, test);
        thread.start();
        thread.join();
}
}
