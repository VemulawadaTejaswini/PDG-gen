public class func{
public void mockingURLWorks(){
        assertSame(url.openConnection(), urlConnectionMock);
        verifyAll();
}
}
