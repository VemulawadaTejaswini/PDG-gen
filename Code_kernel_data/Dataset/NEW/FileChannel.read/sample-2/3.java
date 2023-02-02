//3
public class func{
public void testClose(){
    assertTrue(channel.isOpen());
    channel.close();
    assertFalse(channel.isOpen());
      channel.position();
      channel.position(0);
      channel.lock();
      channel.lock(0, 10, true);
      channel.tryLock();
      channel.tryLock(0, 10, true);
      channel.force(true);
      channel.write(buffer("111"));
      channel.write(buffer("111"), 10);
      channel.write(new ByteBuffer[] {buffer("111"), buffer("111")});
      channel.write(new ByteBuffer[] {buffer("111"), buffer("111")}, 0, 2);
      channel.transferFrom(new ByteBufferChannel(bytes("1111")), 0, 4);
      channel.truncate(0);
      channel.read(buffer("111"));
      channel.read(buffer("111"), 10);
      channel.read(new ByteBuffer[] {buffer("111"), buffer("111")});
      channel.read(new ByteBuffer[] {buffer("111"), buffer("111")}, 0, 2);
      channel.transferTo(0, 10, new ByteBufferChannel(buffer("111")));
}
}
