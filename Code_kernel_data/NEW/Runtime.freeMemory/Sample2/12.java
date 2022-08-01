//11
public class func{
	public void refresh(){
        final Runtime rt = Runtime.getRuntime();
        addStringln("Memory size: \n\t" + NumberUtils.toBinaryByte(rt.totalMemory()));
        addStringln("Used memory: \n\t" +
                NumberUtils.toBinaryByte((rt.totalMemory() - rt.freeMemory())));
        addStringln("Free memory: \n\t" + NumberUtils.toBinaryByte(rt.freeMemory()));
}
}
