public class func{
public void mockingURLWorks(){
    URLConnection urlConnectionMock = mock(URLConnection.class);
    when(url.openConnection()).thenReturn(urlConnectionMock);
}
}
