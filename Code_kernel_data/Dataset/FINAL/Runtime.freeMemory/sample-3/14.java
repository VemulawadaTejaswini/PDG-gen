public class func{
public void debug(String msg,long s){
    long f = new Date().getTime();
    log.trace(msg + " d:" + DurationFormatUtils.formatDurationHMS(f - s) + " m:" + 
        ((runtime.totalMemory() - runtime.freeMemory()) / MB + "mb"));
}
}
