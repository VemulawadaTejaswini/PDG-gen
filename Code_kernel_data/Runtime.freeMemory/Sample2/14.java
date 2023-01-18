//13
public class func{
	public void jvm(){
        return SystemJVMResponse.create(
                bytesToValueMap(runtime.freeMemory()),
                bytesToValueMap(runtime.maxMemory()),
                bytesToValueMap(runtime.totalMemory()),
                bytesToValueMap(runtime.totalMemory() - runtime.freeMemory()),
                serverStatus.getNodeId().toString(),
                Tools.getPID(),
                Tools.getSystemInformation());
}
}
