//36
public class func{
	public void test_gc(){
        long afterGC = rt.freeMemory();
        assertTrue("memory was not released after calling System.gc()." +
                "before gc: " + beforeGC + "; after gc: " + afterGC,
                beforeGC < afterGC);
}
}
