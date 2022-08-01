//9
public class func{
	public void onClick(View arg0){
      Thread thread = new dropCacheThread(dropCacheHandler);
      thread.start();
}
}
