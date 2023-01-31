//86
public class func{
	public void getMemoryStats(){
        final Runtime runtime = Runtime.getRuntime();
        final long free = runtime.freeMemory() / 1024;
        final long total = runtime.totalMemory() / 1024;
        return "MEMORY - Total: " + fmt.format(total) + "k " + "Used: "
                + fmt.format(used) + "k " + "Free: "
                + fmt.format(free) + "k";
}
}
