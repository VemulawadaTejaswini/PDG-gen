//74
public class func{
public void run(HttpSession session){
      _log.debug(
        "After:\t\t" +
          nf.format(runtime.freeMemory()) + "\t" +
            nf.format(runtime.totalMemory()) + "\t" +
              nf.format(runtime.maxMemory()));
}
}
