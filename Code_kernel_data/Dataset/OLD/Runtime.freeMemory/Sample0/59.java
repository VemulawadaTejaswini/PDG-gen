//58
public class func{
	public void memory(){
    final Runtime rt = Runtime.getRuntime();
    return rt.totalMemory() - rt.freeMemory();
}
}
