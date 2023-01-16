//50
public class func{
	public void test3(){
        FileInputStream fis = new FileInputStream("/dev/zero");
        fc = fis.getChannel();
        long bytesRead = fc.read(dstBuffers);
        if (bytesRead <= Integer.MAX_VALUE)
            throw new RuntimeException("Test 3 failed "+bytesRead+" < "+Integer.MAX_VALUE);
        fc.close();
}
}
