//102
public class func{
	public void reload(PageContext pc){
      Runtime rt = Runtime.getRuntime();
      java.setEL(FREE_MEMORY,new Double(rt.freeMemory()));
      java.setEL(TOTAL_MEMORY,new Double(rt.totalMemory()));
      java.setEL(MAX_MEMORY,new Double(rt.maxMemory()));
}
}
