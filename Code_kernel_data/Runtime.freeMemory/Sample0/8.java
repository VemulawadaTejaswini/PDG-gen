//7
public class func{
	public void setDebugInfo(){
    Runtime rt = Runtime.getRuntime();
    info.appendln(
      "Memory: free " + new Size(rt.freeMemory()) + 
      " / total " + new Size(rt.totalMemory()) + 
      " / max " + new Size(rt.maxMemory()));
}
}
