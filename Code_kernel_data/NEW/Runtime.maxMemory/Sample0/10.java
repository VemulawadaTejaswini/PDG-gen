//9
public class func{
	public void main(String[] args){
    Runtime r = Runtime.getRuntime();
    r.gc();
    String mem = String.format("Total %dMB, Used %dMB, Free %dMB, Max %dMB", 
        r.totalMemory() / 1048576,
        (r.totalMemory() - r.freeMemory()) / 1048576, 
        r.freeMemory() / 1048576,
        r.maxMemory() / 1048576);
}
}
