//140
public class func{
	public void availableHeapMemory(){
            Runtime runtime = runtime();
            return runtime.maxMemory() - runtime.totalMemory();
}
}
