public class func{
public void test_gc(){
        while(rt.freeMemory() < beforeTest * 2/3) {
             vec.add(new StringBuffer(1000));
        }
        long beforeGC = rt.freeMemory();
}
}
