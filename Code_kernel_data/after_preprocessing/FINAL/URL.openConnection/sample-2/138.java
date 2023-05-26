public class func{
public void mockingURLWorks(){
        URLConnection urlConnectionMock = createMock(URLConnection.class);
        expect(url.openConnection()).andReturn(urlConnectionMock);
}
}
