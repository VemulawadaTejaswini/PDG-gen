//11
public class func{
public void printMemory(String msg){
        long mem2 = rt.totalMemory() - rt.freeMemory();
        print.f("%s %.3fMB => %.3fMB",
                msg,
                1.0 * mem1 / 1024 / 1024,
                1.0 * mem2 / 1024 / 1024);
}
}
