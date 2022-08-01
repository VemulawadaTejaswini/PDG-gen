//22
public class func{
	public void showCorruptionError(Throwable err){
        Runtime runtime = Runtime.getRuntime();
                   +runtime.freeMemory()+"/"+runtime.totalMemory());
        pw.println();
        err.printStackTrace(pw);
        pw.println();
        pw.flush();
}
}
