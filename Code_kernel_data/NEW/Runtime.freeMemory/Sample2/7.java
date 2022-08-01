//6
public class func{
	public void endProcessing(){
      Runtime r = Runtime.getRuntime();
      System.out.println("Total memory: " + r.totalMemory() + ", " +
                         "free memory: " + r.freeMemory() + ", " +
                         "used memory: " + (r.totalMemory() - r.freeMemory()));
}
}
