//41
public class func{
	public void formatUsedMemory(){
        final Runtime runtime = Runtime.getRuntime();
        final long usedBytes = runtime.totalMemory() - runtime.freeMemory();
        String formattedUsedMemory = formatMemory(usedBytes);
}
}
