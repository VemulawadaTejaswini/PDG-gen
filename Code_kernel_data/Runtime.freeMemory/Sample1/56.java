//55
public class func{
	public void reportMemory(){
        long maxMemory = runtime.maxMemory();
        long allocatedMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        sb.append("allocated memory: " + format.format(allocatedMemory / (1024*1024)) + "M\n");
        sb.append("--------------\n");          
        sb.append("[ Xmx: " + format.format(maxMemory / (1024*1024)) + "M ]\n");
        return sb.toString();
}
}
