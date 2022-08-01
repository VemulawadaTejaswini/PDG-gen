//12
public class func{
	public void execute(){
        final Runtime rt = Runtime.getRuntime();
        out.format(fmt_info, str_total, NumberUtils.toBinaryByte(rt.totalMemory()));
        out.format(fmt_info, str_used, NumberUtils.toBinaryByte(rt.totalMemory() - rt.freeMemory()));
        out.format(fmt_info, str_free, NumberUtils.toBinaryByte(rt.freeMemory()));
}
}
