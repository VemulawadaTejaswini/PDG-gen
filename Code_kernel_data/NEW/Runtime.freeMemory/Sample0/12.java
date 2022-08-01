//11
public class func{
	public void report(Logger log){
    Runtime r = Runtime.getRuntime();
    log.log(Level.INFO, "Final Memory: {0}M/{1}M", 
            new Object[]{(r.totalMemory() - r.freeMemory()) / 
                    mb, r.totalMemory() / mb});    
}
}
