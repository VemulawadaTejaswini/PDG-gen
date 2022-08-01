//1
public class func{
	public void mem(){
    System.out.println(String.format("memory max: %.3f total: %.3f free: %.3f used: %.3f (MiB)",
        r.maxMemory() / mib,
        r.totalMemory() / mib,
        r.freeMemory() / mib,
        (r.totalMemory() - r.freeMemory()) / mib));
}
}
