//61
public class func{
	public void getMemoryState(){
    Runtime rt = Runtime.getRuntime();
    return new MemoryState( rt.freeMemory(), rt.totalMemory(), rt.maxMemory() );
}
}
