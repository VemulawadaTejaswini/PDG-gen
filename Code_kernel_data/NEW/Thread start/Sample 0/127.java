//126
public class func{
	public void onClick(View view){
    Thread all = new Thread(new BackgroundWork(mAppList));
    all.start();
}
}
