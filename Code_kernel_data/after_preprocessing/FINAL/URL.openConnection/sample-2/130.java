public class func{
public void mockingInstanceMethodOfFinalSystemClassWorks(){
        URLConnection urlConnection = createMock(URLConnection.class);
        expect(url.openConnection()).andStubReturn(urlConnection);
}
}
