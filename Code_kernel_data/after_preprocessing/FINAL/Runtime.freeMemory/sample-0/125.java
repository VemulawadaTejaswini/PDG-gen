public class func{
public void gc(){
        Runtime rt = Runtime.getRuntime();
        long freeMem0 = rt.freeMemory();
        while (freeMem0 < freeMem && cnt < GC_CALL_CNT) {
            System.gc();
            U.sleep(WAIT_TIME);
            cnt++;
            freeMem = freeMem0;
            freeMem0 = rt.freeMemory();
        }
}
}
