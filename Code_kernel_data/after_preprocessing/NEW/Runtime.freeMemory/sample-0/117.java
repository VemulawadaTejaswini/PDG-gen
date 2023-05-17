//117
public class func{
public void execute(){
            final Runtime rt = Runtime.getRuntime();
            out.format(fmt_out, str_mem_size, NumberUtils.toBinaryByte(rt.totalMemory()));
            out.format(fmt_out, str_mem_free, NumberUtils.toBinaryByte(rt.freeMemory()));
            out.println(str_start);
}
}
