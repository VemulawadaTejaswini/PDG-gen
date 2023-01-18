//0
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
//1
public class func{
	public void testReadsInWriteOnlyMode(){
    FileChannel channel = channel(regularFile(0), WRITE);
      channel.read(buffer("111"));
      channel.read(buffer("111"), 10);
      channel.read(new ByteBuffer[] {buffer("111"), buffer("111")});
      channel.read(new ByteBuffer[] {buffer("111"), buffer("111")}, 0, 2);
      channel.transferTo(0, 10, new ByteBufferChannel(buffer("111")));
      channel.lock(0, 10, true);
}
}
//2
public class func{
	public void readValue(byte[] key,int chunk,int valueLocation){
                    ByteBuffer sizeBuffer = ByteBuffer.allocate(headerSize);
                    dataFile.read(sizeBuffer, valueLocation);
                    short numKeyValues = sizeBuffer.getShort(0);
                    int valueSize = sizeBuffer.getInt(ByteUtils.SIZE_OF_SHORT
                                                      + ByteUtils.SIZE_OF_INT);
                    do {

                        if(keySize == -1 && valueSize == -1) {
                            sizeBuffer.clear();
                            // Reads an extra short, but that is fine since
                            // collisions are rare. Also we save the unnecessary
                            // overhead of allocating a new byte-buffer
                            dataFile.read(sizeBuffer, valueLocation);
                            keySize = sizeBuffer.getInt(0);
                            valueSize = sizeBuffer.getInt(ByteUtils.SIZE_OF_INT);
                            valueLocation += (2 * ByteUtils.SIZE_OF_INT);
                        }

                        // Read key + value
                        ByteBuffer buffer = ByteBuffer.allocate(keySize + valueSize);
                        dataFile.read(buffer, valueLocation);

                        // Compare key
                        if(ByteUtils.compare(key, buffer.array(), 0, keySize) == 0) {
                            return ByteUtils.copy(buffer.array(), keySize, keySize + valueSize);
                        }
                        valueLocation += (keySize + valueSize);
                        keySize = valueSize = -1;

                    } while(--numKeyValues > 0);
}
}
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
//4
public class func{
	public void read(File file,MatFileFilter filter,int policy){
                    buf = ByteBuffer.allocateDirect( (int)roChannel.size() );
                    roChannel.read(buf, 0);
                    buf.rewind();
                    int filesize = (int)roChannel.size();
                    buf = ByteBuffer.allocate( filesize );
                    if (numberOfBlocks > 1) {
                        ByteBuffer tempByteBuffer = ByteBuffer.allocateDirect(DIRECT_BUFFER_LIMIT);
                        for (int block=0; block<numberOfBlocks; block++) {
                            tempByteBuffer.clear();
                            roChannel.read(tempByteBuffer, ((long)block)*DIRECT_BUFFER_LIMIT);
                            tempByteBuffer.flip();
                            buf.put(tempByteBuffer);
                        }
                        tempByteBuffer = null;
                    } else
                    roChannel.read(buf, 0);
                    buf.rewind();
                    buf = roChannel.map(FileChannel.MapMode.READ_ONLY, 0, (int)roChannel.size());
                    bufferWeakRef = new WeakReference<MappedByteBuffer>((MappedByteBuffer)buf);
            readHeader(buf);
            while ( buf.remaining() > 0 )
            {
                readData( buf );
            }
            return getContent();
}
}
//5
public class func{
	public void testPositionedReadWrite(String fsBase){
        buff = ByteBuffer.allocate(1);
        assertEquals(-1, fc.read(buff, 8000));
        assertEquals(1, fc.read(buff, 4000));
        buff.flip();
        assertEquals(1, fc.read(buff, 2000));
        fc.close();
}
}
//6
public class func{
	public void testPositionedReadWrite(String fsBase){
            assertEquals((byte) i, buff.get());
        buff = ByteBuffer.allocate(0);
        assertTrue(fc.read(buff, 8000) <= 0);
        assertEquals(0, fc.position());
        assertTrue(fc.read(buff, 4000) <= 0);
        assertEquals(0, fc.position());
        assertTrue(fc.read(buff, 2000) <= 0);
        assertEquals(0, fc.position());
}
}
//7
public class func{
	public void testChannelFollowsHandle(){
    assertEquals(4, ch.read(buf));
    buf.flip();
    assertEquals(4, ch.read(buf));
    buf.flip();
    assertEquals(4, ch.read(buf));
    assertEquals("ytes", new String(buf.array()));
    buf.flip();
}
}
//8
public class func{
	public void testReadNegative(){
    FileChannel channel = channel(regularFile(0), READ, WRITE);
      channel.read(buffer("111"), -1);
    ByteBuffer[] bufs = {buffer("111"), buffer("111")};
      channel.read(bufs, -1, 10);
      channel.read(bufs, 0, -1);
}
}
//9
public class func{
	public void fileChannel(){
ByteBuffer buf = ByteBuffer.allocate(48);
int bytesRead = inChannel.read(buf);
while (bytesRead != -1) {
  System.out.println("Read " + bytesRead);
  buf.flip();

  while(buf.hasRemaining()){
      System.out.print((char) buf.get());
  }

  buf.clear();
  bytesRead = inChannel.read(buf);
}
}
//10
public class func{
	public void telnet(Channel channel,String message){
                if (file != null && file.exists()) {
                    try{
                        FileInputStream fis = new FileInputStream(file);
                        try {
                          FileChannel filechannel = fis.getChannel();
                          try {
                            size = filechannel.size();
                            ByteBuffer bb;
                            if (size <= SHOW_LOG_LENGTH) {
                                bb = ByteBuffer.allocate((int) size);
                                filechannel.read(bb, 0);
                            } else {
                                int pos = (int) (size - SHOW_LOG_LENGTH);
                                bb = ByteBuffer.allocate(SHOW_LOG_LENGTH);
                                filechannel.read(bb, pos);
                            }
                            bb.flip();
                            String content = new String(bb.array()).replace("<", "&lt;")
                            .replace(">", "&gt;").replace("\n", "<br/><br/>");
                            buf.append("\r\ncontent:"+content);
                            
                            buf.append("\r\nmodified:"+(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                            .format(new Date(file.lastModified()))));
                            buf.append("\r\nsize:"+size +"\r\n");
                          } finally {
                            filechannel.close();
                          }
                        } finally {
                          fis.close();
                        }
                    }catch (Exception e) {
                        buf.append(e.getMessage());
                    }
                }else {
                    size = 0;
                    buf.append("\r\nMESSAGE: log file not exists or log appender is console .");
                }
}
}
//11
public class func{
	public void index(Map<String,Object> context){
        File file = LoggerFactory.getFile();
        if (file != null && file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            FileChannel channel = fis.getChannel();
            size = channel.size();
            ByteBuffer bb;
            if (size <= SHOW_LOG_LENGTH) {
                bb = ByteBuffer.allocate((int) size);
                channel.read(bb, 0);
            } else {
                int pos = (int) (size - SHOW_LOG_LENGTH);
                bb = ByteBuffer.allocate(SHOW_LOG_LENGTH);
                channel.read(bb, pos);
            }
            bb.flip();
            content = new String(bb.array()).replace("<", "&lt;").replace(">", "&gt;");
            modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified()));
        } else {
            size = 0;
            content = "";
            modified = "Not exist";
        }
}
}
//12
public class func{
	public void handle(URL url){
    if (file != null && file.exists()) {
      try {
        FileInputStream fis = new FileInputStream(file);
        FileChannel channel = fis.getChannel();
        size = channel.size();
        ByteBuffer bb;
        if (size <= SHOW_LOG_LENGTH) {
          bb = ByteBuffer.allocate((int) size);
          channel.read(bb, 0);
        } else {
          int pos = (int) (size - SHOW_LOG_LENGTH);
          bb = ByteBuffer.allocate(SHOW_LOG_LENGTH);
          channel.read(bb, pos);
        }
        bb.flip();
        content = new String(bb.array()).replace("<", "&lt;")
            .replace(">", "&gt;").replace("\n", "<br/><br/>");
        modified = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            .format(new Date(file.lastModified()));
      } catch (IOException e) {
      }
    }
}
}
//13
public class func{
	public void create(FileChannel fc,ByteOrder tiffFileOrder){
        ByteBuffer header = ByteBuffer.wrap(new byte[12]).order( tiffFileOrder );
            fc.read( header );
            header.flip();
            int type = getUnsignedShort( header );
            long count = getUnsignedInt( header );
            if ( type == Tiff.Type.SHORT && count == 1 )
            {
                // these get packed left-justified in the bytes...
                int upper = getUnsignedShort( header );
                int lower = getUnsignedShort( header );
                long value = (MASK_USHORT & upper) << 16 | (MASK_USHORT & lower);

                return new TiffIFDEntry(tag, type, value );
            }
            else if( count == 1 && (type == Tiff.Type.LONG || type == Tiff.Type.FLOAT))
            {
                long value = header.getInt();
                return new TiffIFDEntry(tag, type, value );
            }
            else
            {
                long offset = getUnsignedInt( header );
                int size = MASK_USHORT & (int)calcSize( type, count );

                if( size > 0L )
                {
                    ByteBuffer data = ByteBuffer.allocateDirect( size ).order( tiffFileOrder );
                    savedPosition = fc.position();
                    fc.position( offset );
                    fc.read( data );
                    data.flip();

                    fc.position( savedPosition );
                    savedPosition = 0;

                    return new TiffIFDEntry(tag, type, count, offset, data );
                }
                else
                    return new TiffIFDEntry(tag, type, count, offset );
            }
}
}
//14
public class func{
	public void readFromFileChannel(final FileChannel fileChannel,final Buffer buffer){
        if (!buffer.isComposite()) {
            final ByteBuffer bb = buffer.toByteBuffer();
            final int oldPos = bb.position();
            bytesRead = fileChannel.read(bb);
            bb.position(oldPos);
        } else {
            final ByteBufferArray array = buffer.toByteBufferArray();
            bytesRead = fileChannel.read(
                    array.getArray(), 0, array.size());

            array.restore();
            array.recycle();
        }
        if (bytesRead > 0) {
            buffer.position(buffer.position() + (int) bytesRead);
        }
}
}
//15
public class func{
	public void validateMessage(FileChannel channel,long start,long len,ByteBuffer buffer){
        buffer.rewind();
        int read = channel.read(buffer, start);
        if (read < 4) return -1;
        int size = buffer.getInt(0);
        if (size < Message.MinHeaderSize) return -1;
        if (next > len) return -1;
        ByteBuffer messageBuffer = ByteBuffer.allocate(size);
        while (messageBuffer.hasRemaining()) {
            read = channel.read(messageBuffer, curr);
            if (read < 0) throw new IllegalStateException("File size changed during recovery!");
            else curr += read;
        }
        messageBuffer.rewind();
        Message message = new Message(messageBuffer);
        if (!message.isValid()) return -1;
        else return next;
}
}
//16
public class func{
	public void load(ByteBasedSortedMap m,File f){
      ByteBuffer buf0 = ByteBuffer.allocate(hdr);
      while (buf0.hasRemaining())
        fc.read(buf0);
      buf0.flip();
      m.currentSize = buf0.getInt();
      m.lastModified = buf0.getLong();
      ByteBuffer bytesB = ByteBuffer.allocate(m.bytesUsed);
      while (fc.read(bufs) > 0);
      keyoffsetB.flip();
      IntBuffer iB = keyoffsetB.asIntBuffer();
      iB.get(m.keyOffsetsArray);
}
}
//17
public class func{
	public void load(ByteBasedList l,File f){
      ByteBuffer buf0 = ByteBuffer.allocate(hdr);
      while (buf0.hasRemaining())
        fc.read(buf0);
      buf0.flip();
      l.currentSize = buf0.getInt();
      l.lastModified = buf0.getLong();
      ByteBuffer bytesB = ByteBuffer.allocate(l.bytesUsed);
      while (fc.read(bufs) > 0);
      offsetB.flip();
      IntBuffer iB = offsetB.asIntBuffer();
      iB.get(l.offsetsArray);
}
}
//18
public class func{
	public void testFilePath(){
            long pos = ch.size();
            p("size=" + pos);
            ch.write(buff);
            buff.clear();
            ch.read(buff, 0);
            buff.clear();
            ch.read(buff, 0);
            if (ch != null)
                ch.close();
}
}
//19
public class func{
	public void readEdges(MeshVisu mesh,OEMM.Node current){
          LOGGER.log(Level.FINE, "Reading " + (nbrOfEdgesComponents / 2) + " edges from " + MeshVisuBuilder.getEdgesFile(oemm, current));
        byteBuffer = ByteBuffer.allocate((Integer.SIZE / 8) * nbrOfEdgesComponents);
        bufferInteger = byteBuffer.asIntBuffer();
        byteBuffer.rewind();
        fc.read(byteBuffer);
        bufferInteger.rewind();
        bufferInteger.get(temp);
      ByteBuffer byteBuffer = ByteBuffer.allocate(Integer.SIZE / 8);
      IntBuffer bufferInteger = byteBuffer.asIntBuffer();
      byteBuffer.rewind();
      fc.read(byteBuffer);
}
}
//20
public class func{
	public void testChannelFollowsHandle(){
    assertEquals(4, ch.read(buf));
    buf.flip();
    assertEquals(4, ch.read(buf));
    buf.flip();
}
}
//21
public class func{
	public void testReadFully_ReadableByteChannel(){
        final FileInputStream fileInputStream = new FileInputStream(m_testFile);
        final FileChannel input = fileInputStream.getChannel();
            IOUtils.readFully(input, buffer);
            assertEquals(FILE_SIZE, buffer.position());
            assertEquals(0, buffer.remaining());
            assertEquals(0, input.read(buffer));
            IOUtils.readFully(input, buffer);
            assertEquals(FILE_SIZE, buffer.position());
            assertEquals(0, buffer.remaining());
            assertEquals(0, input.read(buffer));
            IOUtils.readFully(input, buffer);
            buffer.clear();
                IOUtils.readFully(input, buffer);
}
}
//22
public class func{
	public void transferTo(){
            assertEquals (8, sourceChannel.transferTo(0, 8, fileChannel));
            assertEquals (10, sourceChannel.transferTo(8, 11, fileChannel));
            fileChannel.position(0);
            assertEquals(6, fileChannel.read(transferedMessage1));
            assertEquals(12, fileChannel.read(transferedMessage2));
}
}
//23
public class func{
	public void transfer(FileChannel source,WritableByteChannel destination,long position,long length){
      _transferByteBuffer.limit((int)length);
      source.read(_transferByteBuffer, position);
      _transferByteBuffer.flip();
      destination.write(_transferByteBuffer);
}
}
//24
public class func{
	public void testUTF16BOMMultipleFieldSeperators(){
        FileChannel fc = new RandomAccessFile(testFile,"r").getChannel();
        fc.read(bb);
        assertEquals('T',bb.get(10) & 0xFF);
        assertEquals('P',bb.get(11) & 0xFF);
        assertEquals('E',bb.get(12) & 0xFF);
        assertEquals('2',bb.get(13) & 0xFF);
        assertEquals(0xFF,bb.get(21) & 0xFF);
        assertEquals(0xFE,bb.get(22) & 0xFF);
        assertEquals(0xDE,bb.get(23) & 0xFF);
        assertEquals(0x03,bb.get(24) & 0xFF);
        assertEquals(0x00,bb.get(25) & 0xFF);
        assertEquals(0x00,bb.get(26) & 0xFF);
        assertEquals(0xFF,bb.get(27) & 0xFF);
        assertEquals(0xFE,bb.get(28) & 0xFF);
        assertEquals(0xDE,bb.get(29) & 0xFF);
        assertEquals(0x03,bb.get(30) & 0xFF);
        assertEquals(0x54,bb.get(31) & 0xFF);
        assertEquals(0x58,bb.get(32) & 0xFF);
        assertEquals(0x58,bb.get(33) & 0xFF);
        assertEquals(0x58,bb.get(34) & 0xFF);
}
}
//25
public class func{
	public void test1(){
            long bytesRead = fc.read(dstBuffers);
            for (int i=0; i<NUM_BUFFERS; i++) {
                for (int j=0; j<BUFFER_CAP; j++) {
                    byte b = dstBuffers[i].get(j);
                    if (b != expectedResult++)
                        throw new RuntimeException("Test failed");
                }
                dstBuffers[i].flip();
            }
}
}
//26
public class func{
	public void call(FileChannel channel){
            channel.read(bufArray, 0, 1);
}
}
//27
public class func{
	public void doOp(FileChannel channel){
          return channel.read(dst);
}
}
//28
public class func{
	public void call(FileChannel channel){
            channel.read(buf);
}
}
//29
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, -1, 0);
}
}
//30
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 1, 2);
}
}
//31
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 0, -1);
}
}
//32
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 0, 3);
}
}
//33
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 2, 1);
}
}
//34
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 3, 0);
}
}
//35
public class func{
	public void findAndValidateKeystone(){
                _readBuffer.limit(JH.MAX_LENGTH);
                readChannel.read(_readBuffer, 0);
                _readBuffer.flip();
                final int recordSize = JH.getLength(_readBuffer);
                final long version = JH.getVersion(_readBuffer);
                _blockSize = JH.getBlockSize(_readBuffer);
                _baseAddress = JH.getBaseJournalAddress(_readBuffer);
                _journalCreatedTime = JH.getJournalCreatedTime(_readBuffer);
                _keystoneAddress = JH.getCurrentJournalAddress(_readBuffer);
                validate(_baseAddress, candidate, 0, 0, _keystoneAddress,
                        "Base address %3$,d after current address %4$,d:  at %1$s:%2$,d");
}
}
//36
public class func{
	public void doOp(FileChannel channel){
          return channel.read(dsts, offset, length);
}
}
//37
public class func{
	public void read(FileChannel handle,int bytes){
            handle.read (chunk.data);
}
}
//38
public class func{
	public void test_read$LByteBuffer_mock(){
        FileChannel mockChannel = new MockFileChannel();
        mockChannel.read(buffers);
        assertTrue(((MockFileChannel)mockChannel).isReadCalled);
}
}
//39
public class func{
	public void testChannelRead_exceptionWhenAlreadyInterrupted(ChannelReader.Method method){
        fileInputChannel.read(buffer);
}
}
//40
public class func{
	public void ScrollingBuffer(FileChannel channel,ByteOrder order,boolean useMemoryMapping){
                this.buffer = NIOUtilities.allocate(8 * 1024);
                this.buffer.order(order);
                channel.read(buffer);
                buffer.flip();
}
}
//41
public class func{
	public void testFastMd50BytesReturned(){
        FileChannel f = mock(FileChannel.class);
        when(f.read(any(ByteBuffer.class))).thenReturn(0).thenReturn(-1);
}
}
//42
public class func{
	public void call(FileChannel channel){
            channel.read(buf, 0);
}
}
//43
public class func{
	public void testConcurrentReadWrite(){
        countRead = channelRead.read(bufferRead);
        assertEquals("Expected full read", 26, countRead);
}
}
//44
public class func{
	public void read(byte subsystem,FileChannel chan){
      return( chan.read(buffer ));
}
}
//45
public class func{
	public void testChannelRead_exceptionWhenAlreadyClosed(ChannelReader.Method method){
        fileInputChannel.read(buffer);
}
}
