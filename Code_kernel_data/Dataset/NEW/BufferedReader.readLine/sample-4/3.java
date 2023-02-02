//3
public class func{
public void answer(){
                InputStreamSource contentStream = (InputStreamSource)EasyMock.getCurrentArguments()[1];
                BufferedReader reader = new BufferedReader(new InputStreamReader(contentStream.getInputStream()));
                Assert.assertEquals(reader.readLine(), "This is a SOAP attachment");
                Assert.assertEquals(reader.readLine(), "with multi-line");
                reader.close();
}
}
