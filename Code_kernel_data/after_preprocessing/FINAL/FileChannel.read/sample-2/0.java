public class func{
public void testReadOnlyByteArrays(){
        File tmp = File.createTempFile("FileChannelTest", "tmp");
        FileChannel fc = new FileInputStream(tmp).getChannel();
            fc.read(readOnly);
            fc.read(new ByteBuffer[] { readOnly });
            fc.read(new ByteBuffer[] { readOnly }, 0, 1);
            fc.read(readOnly, 0L);
        fc.close();
}
}
