public class func{
public void test_ConstructorLjava_io_InputStream(){
            Support_Resources.copyFile(resources, null, "hyts_gInput.txt.gz");
            final URL gInput = new File(resources.toString() + "/hyts_gInput.txt.gz").toURL();
            TestGZIPInputStream inGZIP = new TestGZIPInputStream(gInput
                    .openConnection().getInputStream());
            assertNotNull("the constructor for GZIPInputStream is null",
                    inGZIP);
            assertEquals("the CRC value of the inputStream is not zero", 0, inGZIP
                    .getChecksum().getValue());
            inGZIP.close();
}
}
