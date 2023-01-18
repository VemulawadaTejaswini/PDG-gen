//10
public class func{
	public void saveErrorReport(LogRecord record){
            Runtime rt = Runtime.getRuntime();
            error_report_pb.setHeapSize(rt.totalMemory());
            error_report_pb.setHeapFree(rt.freeMemory());
            error_report_pb.setHeapAllocated(rt.totalMemory() - rt.freeMemory());
}
}
