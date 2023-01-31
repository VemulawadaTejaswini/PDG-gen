//59
public class func{
	public void usedMemory(){
        Runtime r = Runtime.getRuntime();
        return r.totalMemory() - r.freeMemory();
}
}
