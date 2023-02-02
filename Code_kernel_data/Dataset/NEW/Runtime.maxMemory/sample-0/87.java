//87
public class func{
public void Report(Throwable t){
  Runtime rt = Runtime.getRuntime();
  props.put("mem.free", rt.freeMemory());
  props.put("mem.total", rt.totalMemory());
  props.put("mem.max", rt.maxMemory());
}
}
