//121
public class func{
	public void runFinalizerIfNeeded(){
        Runtime rt = Runtime.getRuntime();
        if (rt.freeMemory() < HALFMB){
            println("Waiting for finalizer ");
            rt.runFinalization();
            

        }
}
}
