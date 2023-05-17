public class func{
public void testMassiveWriteContainerHistory(){
    long usedMemoryAfter = (runtime.totalMemory() - runtime.freeMemory()) / mb;
    Assert.assertTrue((usedMemoryAfter - usedMemoryBefore) < 200);
}
}
