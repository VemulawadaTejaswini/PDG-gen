//82
public class func{
public void uft(){
    Runtime rt = Runtime.getRuntime();
    long free = rt.freeMemory(), total = rt.totalMemory(), used = total - free;
    return "Used " + nf.format(used) + " - free " + nf.format(free) + " - total " + nf.format(total); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
}
}
