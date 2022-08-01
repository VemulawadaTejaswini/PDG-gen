//13
public class func{
	public void getDisplayStats(Display d){
        Runtime rt = Runtime.getRuntime();
        long tm = rt.totalMemory() / (2<<20);
        long fm = rt.freeMemory() / (2<<20);
        long mm = rt.maxMemory() / (2<<20);
}
}
