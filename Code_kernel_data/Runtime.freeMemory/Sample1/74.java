//73
public class func{
	public void run(HttpSession ses){
      _log.debug(
        "After GC: " +
          nf.format(runtime.freeMemory()) + " free, " +
            nf.format(runtime.totalMemory()) + " total, and " +
              nf.format(runtime.maxMemory()) + " max");
}
}
