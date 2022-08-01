//18
public class func{
	public void checkFreeMem(){
            Runtime r = Runtime.getRuntime();
            long max = r.maxMemory();
            if(max == Long.MAX_VALUE)
                return;
            double free = r.freeMemory();
            double total = r.totalMemory();
}
}
