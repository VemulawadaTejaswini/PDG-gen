//128
public class func{
public void mockingURLWorks(){
    URLConnection openConnection = url.openConnection();
    assertSame(openConnection, urlConnectionMock);
}
}
