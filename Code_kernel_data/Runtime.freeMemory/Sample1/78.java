//77
public class func{
	public void writeResponse(ManagementCenterService mcs,JsonObject root){
        properties.add("memory.cl_freeMemory", Long.toString(runtime.freeMemory()));
        properties.add("memory.cl_totalMemory", Long.toString(runtime.totalMemory()));
        properties.add("memory.cl_maxMemory", Long.toString(runtime.maxMemory()));
}
}
