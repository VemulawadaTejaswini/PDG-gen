//4
public class func{
public void assertMessages(final long id1,final long id2){
        assertEquals(this.messageStore.nameFromOffset(0), logs[0].getName());
        final FileChannel channel = new RandomAccessFile(logs[0], "rw").getChannel();
            final ByteBuffer buf = ByteBuffer.allocate((int) channel.size());
            while (buf.hasRemaining()) {
                channel.read(buf);
            }
            buf.flip();
            final DecodedMessage decodedMessage1 = MessageUtils.decodeMessage(this.topic, buf.array(), 0);
                    MessageUtils.decodeMessage(this.topic, buf.array(), decodedMessage1.newOffset);
}
}
