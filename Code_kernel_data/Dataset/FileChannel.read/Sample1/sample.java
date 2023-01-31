//0
public class func{
	public void increaseMajor(String cfile,int delta){
            ByteBuffer rbuf = ByteBuffer.allocate(2);
            fc.read(rbuf, 6);
            ByteBuffer wbuf = ByteBuffer.allocate(2);
}
}
//1
public class func{
	public void copyFile(File src,File dst,IProject project){
        buffer = ByteBuffer.allocate(1024);
        while (in.read(buffer) != -1) {
          buffer.flip(); // Prepare for writing
          out.write(buffer);
          buffer.clear(); // Prepare for reading
        }
        if (in != null) {
          in.close();
        }
}
}
//2
public class func{
	public void readValue(byte[] key,int chunk,int valueLocation){
                    ByteBuffer sizeBuffer = ByteBuffer.allocate(ByteUtils.SIZE_OF_INT);
                    dataFile.read(sizeBuffer, valueLocation);
                    int valueSize = sizeBuffer.getInt(0);
                    ByteBuffer valueBuffer = ByteBuffer.allocate(valueSize);
                    dataFile.read(valueBuffer, valueLocation + ByteUtils.SIZE_OF_INT);
                    return valueBuffer.array();
}
}
//3
public class func{
	public void test_size(){
            ByteBuffer buf = ByteBuffer.allocate(8);
            assertEquals(8, specialFile.read(buf));
            ByteBuffer[] bufs = { ByteBuffer.allocate(8) };
            assertEquals(8, specialFile.read(bufs, 0, 1));
            specialFile.close();
}
}
//4
public class func{
	public void testFileHeaderCorruption(){
                fc.write(ByteBuffer.allocate(256), fc.size() - 256);
            ByteBuffer buff = ByteBuffer.allocate(4 * 1024);
            fc.read(buff, i);
            String h = new String(buff.array(), "UTF-8").trim();
            int idx = h.indexOf("fletcher:");
}
}
//5
public class func{
	public void main(String[] args){
      ByteBuffer buf = ByteBuffer.allocate(48);
      while (fc.read(buf) != -1) {
        buf.flip();
        while (buf.hasRemaining())
          System.out.print((char) buf.get());
        buf.clear();
      }
    finally { fc.close(); }
}
}
//6
public class func{
	public void main(String[] args){
    ByteBuffer buff = ByteBuffer.allocate( 32*1024 );
    while ( in.read( buff ) > 0 ) {
      buff.flip();
      out.write( buff );
      buff.clear();
    }
    in.close();
}
}
//7
public class func{
	public void call(){
        ByteBuffer bb = ByteBuffer.allocate(BUFSIZE);
        while (fc.read(bb) != -1) {
          bb.flip();
          outChannel.write(bb);
          bb.clear();
        }
        fc.close();
}
}
//8
public class func{
	public void NeoStoreUtil(String storeDir){
            ByteBuffer buf = ByteBuffer.allocate( 4*9 );
            if ( fileChannel.read( buf ) != 4*9 )
            {
                throw new RuntimeException( "Unable to read neo store header information" );
            }
            buf.flip();
            buf.get(); // in use byte
            creationTime = buf.getLong();
            buf.get(); // in use byte
            storeId = buf.getLong();
            buf.get(); 
            version = buf.getLong(); // skip log version
            buf.get(); // in use byte
            txId = buf.getLong();
}
}
//9
public class func{
	public void readBackendInfo(File file){
        if ( !file.exists() || ( file.length() == 0 ) ) {
            return new ModelBackendInfo();
        }
        RandomAccessFile raf = new RandomAccessFile( file, "r" );
        FileChannel channel = raf.getChannel();
        ByteBuffer bb = ByteBuffer.allocate( (int) raf.length() );
        channel.read( bb );
        channel.close();
}
}
//10
public class func{
	public void fillRegistry(){
        RandomAccessFile f = new RandomAccessFile( file, "r" );
        FileChannel channel = f.getChannel();
        channel.position( 0 );
        ByteBuffer fileBuffer = ByteBuffer.allocate( (int) channel.size() );
        channel.read( fileBuffer );
        channel.close();
}
}
//11
public class func{
	public void readV2Tag(File file,int loadOptions,int startByte){
                fis = new FileInputStream(file);
                fc = fis.getChannel();
                bb = fc.map(FileChannel.MapMode.READ_ONLY,0,startByte);
                bb =  ByteBuffer.allocate(startByte);
                fc.read(bb,0);
                if (fc != null)
                {
                    fc.close();
                }
                if (fis != null)
                {
                    fis.close();
                }
}
}
//12
public class func{
	public void readV2Tag(File file,int loadOptions){
                bb = ByteBuffer.allocate(startByte);
                fc.read(bb);
                if (fc != null) {
                    fc.close();
                }
                if (fis != null) {
                    fis.close();
                }
}
}
//13
public class func{
	public void readFileAsByteBuffer(String inputFile,boolean directMemory){
      bb = ByteBuffer.allocateDirect((int) l);
      bb = ByteBuffer.allocate((int) l);
    int read = fc.read(bb);
    fc.close();
}
}
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
//15
public class func{
	public void testCreateUTF16AndResetEvenIfNotNeededIfDefaultSetEncodedSizeTerminatedString(){
        ByteBuffer buffer = ByteBuffer.allocate(100);
        int count = fc.read(buffer);
        fc.close();
}
}
//16
public class func{
	public void testSetPrePaddedDiscTotal(){
        ByteBuffer buffer = ByteBuffer.allocate(100);
        fc.read(buffer);
        fc.close();
}
}
//17
public class func{
	public void testDoesntCreateUTF16IfDefaultSetEncodedSizeTerminatedStringifOverriddenUsingSetBody(){
        ByteBuffer buffer = ByteBuffer.allocate(100);
        int count = fc.read(buffer);
        fc.close();
}
}
//18
public class func{
	public void truncateLogicalLog(int size){
        ByteBuffer buffer = ByteBuffer.allocate( 1024 );
        af.read( buffer );
        af.close();
}
}
//19
public class func{
	public void testSetDiscNoWithPaddingAndLengthOne(){
        ByteBuffer buffer = ByteBuffer.allocate(100);
        fc.read(buffer);
        fc.close();
}
}
//20
public class func{
	public void testSetTrackNoWithNoPaddingThenSetPaddingAndLengthOne(){
        ByteBuffer buffer = ByteBuffer.allocate(100);
        fc.read(buffer);
        fc.close();
}
}
//21
public class func{
	public void testSetTrackNo(){
        ByteBuffer buffer = ByteBuffer.allocate(100);
        fc.read(buffer);
        fc.close();
}
}
//22
public class func{
	public void test_readv(){
        ByteBuffer[] buffers = new ByteBuffer[] { ByteBuffer.allocateDirect(4), ByteBuffer.allocate(4) };
        assertEquals(8, fc.read(buffers));
        fc.close();
}
}
//23
public class func{
	public void setKeystoreFile(String path){
        ByteBuffer fb = ByteBuffer.allocate(Long.valueOf(file.length()).intValue());
        fc.read(fb);
        fb.flip();
        keystore = IoBuffer.wrap(fb).array();
}
}
//24
public class func{
	public void setVersion(String storeDir,long version){
            ByteBuffer buffer = ByteBuffer.allocate( 8 );
            channel.read( buffer );
            buffer.flip();
            long previous = buffer.getLong();
}
}
//25
public class func{
	public void copy(File file,File backup){
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        while( in.read(buffer) != -1 ) {
            buffer.flip(); // Prepare for writing
            out.write(buffer);
            buffer.clear(); // Prepare for reading
        }
}
}
//26
public class func{
	public void testCreateIdGenerator(){
            ByteBuffer buffer = ByteBuffer.allocate( 9 );
            assertEquals( 9, fileChannel.read( buffer ) );
            buffer.flip();
            assertEquals( (byte) 0, buffer.get() );
}
}
//27
public class func{
	public void decodeSmallFile(FileChannel channel,int lsize,String charSet){
    ByteBuffer byteBuffer = ByteBuffer.allocate(lsize);
    channel.read(byteBuffer);
    byteBuffer.flip();
    skipUTF8ByteOrderMark(byteBuffer, charSet);
    CharBuffer charBuffer = Charset.forName(charSet).decode(byteBuffer);
    char[] buf= extractChars(charBuffer);
    return new CharArray(buf);
}
}
//28
public class func{
	public void decodeSmallFile(FileChannel channel,final int isize,String encoding){
    ByteBuffer byteBuffer = ByteBuffer.allocate(isize);
    channel.read(byteBuffer);
    byteBuffer.flip();
}
}
//29
public class func{
	public void decode(File f){
            ByteBuffer buf = ByteBuffer.allocate(4096);
            channel.read(buf);
            buf.flip();
}
}
//30
public class func{
	public void testBigWrite(){
        ByteBuffer readInMe = ByteBuffer.allocate( writesAtFirst*4 );
        dup.read( readInMe );
        readInMe.flip();
}
}
//31
public class func{
	public void copyLogicalLog(String storeDir){
        ByteBuffer buffer = ByteBuffer.allocate( 1024 );
        af.read( buffer );
        buffer.flip();
}
}
//32
public class func{
	public void retrieveParts(int contentId,int[] start,int[] end){
        for (int i = 0; i < n; i++) {
          if (start[i] == -1 && end[i] == -1) {
            // whole content
            start[i] = 0;
            end[i] = charLength;
          }
          if (start[i] < 0 || end[i] < 0) {
            throw new RuntimeException("Illegal values, start = " + start[i]
                + ", end = " + end[i]);
          }
          if (start[i] > charLength || end[i] > charLength) {
            throw new RuntimeException("Value(s) out of range, start = " + start[i]
                + ", end = " + end[i] + ", content length = " + charLength);
          }
          if (end[i] <= start[i]) {
            throw new RuntimeException(
                "Tried to read empty or negative length snippet (from " + start[i]
                    + " to " + end[i] + ")");
          }
          long startOffsetBytes = e.offset + start[i] * BYTES_PER_CHAR
              + BYTE_ORDER_MARK_SIZE;
          int bytesToRead = (end[i] - start[i]) * BYTES_PER_CHAR;
          ByteBuffer buffer = ByteBuffer.allocate(bytesToRead);
          int bytesRead = fileChannel.read(buffer, startOffsetBytes);
          if (bytesRead < bytesToRead)
            throw new RuntimeException("Not enough bytes read, " + bytesRead + " < "
                + bytesToRead);
          result[i] = new String(buffer.array(), 0, bytesRead, CHAR_ENCODING);
        }
        fileInputStream.close();
}
}
//33
public class func{
	public void buildTree(RandomAccessFile raf,boolean closeExit){
                    moovBuffer = ByteBuffer.allocate(boxHeader.getDataLength());
                    int bytesRead = fc.read(moovBuffer);
                    if(bytesRead < boxHeader.getDataLength())
                    {
                        String msg = ErrorMessage.ATOM_LENGTH_LARGER_THAN_DATA.getMsg(boxHeader.getId(), boxHeader.getDataLength(),bytesRead);
                        throw new CannotReadException(msg);
                    }
                    moovBuffer.rewind();
                    buildChildrenOfNode(moovBuffer, newAtom);
}
}
//34
public class func{
	public void readInt(FileChannel data,int off){
    ByteBuffer b = ByteBuffer.allocate(4);
    int read = data.read(b, off);
    if (read != 4) throw new IOException(read + " bytes instead of 4");
    return b.getInt(0);
}
}
//35
public class func{
	public void testRandomAccessRead(){
        ByteBuffer buffer = ByteBuffer.allocate(bytes.length);
        int count = fileChannel.read(buffer);
        assertEquals("Incorrect number of bytes read", bytes.length, count);
        buffer.rewind();
        buffer.get(bytes);
        String checkContent = new String(bytes);
        assertEquals("Content read failure", content, checkContent);
}
}
//36
public class func{
	public void testAudioMuxer(File wav,File out){
        ByteBuffer buffer = ByteBuffer.allocate(3 * 24000);
        while (ch.read(buffer) != -1) {
            track.addSamples(buffer);
        }
}
}
//37
public class func{
	public void getStringFromFile(File file){
        ByteBuffer  bytebuffer = ByteBuffer.allocate((int)file.length());
        int n=channel.read(bytebuffer);
        bytebuffer.position(0);
        CharBuffer charbuffer = UTF8.decode(bytebuffer);
}
}
//38
public class func{
	public void initialWritePosition(){
        ByteBuffer buf = ByteBuffer.allocate( AllocatedHeapMemory.LONG_SIZE );
        channel.read( buf );
        buf.rewind();
        long result = buf.getLong();
}
}
//39
public class func{
	public void testPositionedReadWrite(String fsBase){
        buff = ByteBuffer.allocate(4000);
        assertEquals(4000, fc.read(buff, 96));
        assertEquals(0, fc.position());
}
}
//40
public class func{
	public void testBasicCreationAndOps(){
        ByteBuffer readBuffer = ByteBuffer.allocate( 16 );
        assertEquals( readBuffer.capacity(), channel.read( readBuffer, 4 ) );
        assertEquals( 0, channel.position() );
}
}
//41
public class func{
	public void testReadAtBoundaries(){
        ByteBuffer readBuffer = ByteBuffer.allocate( 12 );
        assertEquals( readBuffer.capacity(), channel.read( readBuffer ) );
        assertEquals( 24, channel.position() );
}
}
//42
public class func{
	public void print(FileChannel fc,int level,long start,long end){
            ByteBuffer bb = ByteBuffer.allocate(8);
            fc.read(bb);
            bb.rewind();
            long size = IsoTypeReader.readUInt32(bb);
            String type = IsoTypeReader.read4cc(bb);
}
}
//43
public class func{
	public void buildTree(RandomAccessFile raf,boolean closeExit){
                    moovBuffer = ByteBuffer.allocate(boxHeader.getDataLength());
                    fc.read(moovBuffer);
                    moovBuffer.rewind();
                    buildChildrenOfNode(moovBuffer, newAtom);
}
}
//44
public class func{
	public void transferFirstChannelDataToFileChannel(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(30);
            assertEquals(20, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "data", "from", "first", "channel");
}
}
//45
public class func{
	public void transferFirstChannelDataAndPushedMessageToFileChannel1(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(10);
            assertEquals(8, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "xnio-api");
}
}
//46
public class func{
	public void transferBlockingToFile2(){
            ByteBuffer buffer = ByteBuffer.allocate(10);
            fileChannel.read(buffer);
            assertReadMessage(buffer, "test", "1234");
}
}
//47
public class func{
	public void testFileSystem(){
            ByteBuffer data = ByteBuffer.allocate(1024);
            fc.read(data, 0);
            data.flip();
            int got = data.get();
}
}
//48
public class func{
	public void extractID3v2TagDataIntoFile(File outputFile){
            ByteBuffer bb = ByteBuffer.allocate(startByte);
            fc.read(bb);
}
}
//49
public class func{
	public void testUnreadableChannel(){
            fc.read(ByteBuffer.allocate(256),1);
}
}
//50
public class func{
	public void checkReadOnlyFileChannel(FileChannel fileChannel){
            ByteBuffer buffer = ByteBuffer.allocate(10);
            fileChannel.read(buffer);
            assertReadMessage(buffer);
}
}
//51
public class func{
	public void transferFirstChannelDataAndPushedMessageToFileChannel2(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(10);
            assertEquals(8, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "xnio-api");
}
}
//52
public class func{
	public void testFISFollowsFD(){
    ByteBuffer bb = ByteBuffer.allocate(1 * 1024 * 1024); // read a meg
    int read = fc.read(bb);
    assertEquals(-1, read); // reached EOF
}
}
//53
public class func{
	public void transferPushedMessageToFileChannel(){
            final ByteBuffer transferedMessage = ByteBuffer.allocate(6);
            assertEquals(6, fileChannel.read(transferedMessage));
            assertReadMessage(transferedMessage, "pushed");
}
}
//54
public class func{
	public void testNegativePosition(){
            fc.read(ByteBuffer.allocate(256), -1L);
}
}
//55
public class func{
	public void testFileTimeUpdates(){
    channel.read(new ByteBuffer[] {ByteBuffer.allocate(10)});
}
}
//56
public class func{
	public void testFileTimeUpdates(){
    channel.read(new ByteBuffer[] {ByteBuffer.allocate(10)}, 0, 1);
}
}
//57
public class func{
	public void testFileTimeUpdates(){
    channel.read(ByteBuffer.allocate(10));
}
}
//58
public class func{
	public void testFileTimeUpdates(){
    channel.read(ByteBuffer.allocate(10), 0);
}
}
//59
public class func{
	public void transferBlockingToFile1(){
            ByteBuffer buffer = ByteBuffer.allocate(10);
            fileChannel.read(buffer);
            assertReadMessage(buffer, "test");
}
}
