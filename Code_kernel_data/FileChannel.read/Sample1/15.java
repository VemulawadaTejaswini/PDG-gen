//14
public class func{
	public void executeTest(String preallocationStrategy){
        ByteBuffer buff = ByteBuffer.allocate(1);
        channel.read(buff);
        buff.flip();
        buff.position(0);
        assertEquals(0x00, buff.get());
}
}
