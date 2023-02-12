public class func{
public void testTransferInputStreamToFile(){
        URL u = TestIOUtilities.class.getClassLoader().getResource("io-test.txt");
        IOUtilities.transfer(u.openConnection(), f, null);
}
}
