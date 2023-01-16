//64
public class func{
	public void test503(){
        HttpURLConnection httpURLConnection = EasyMock.createMock(HttpURLConnection.class);
        EasyMock.expect(mock.openConnection()).andReturn(httpURLConnection);
        httpURLConnection.connect();
        EasyMock.expect(httpURLConnection.getContentEncoding()).andReturn("");
}
}
