//41
public class func{
	public void testFastMd50BytesReturned(){
        FileChannel f = mock(FileChannel.class);
        when(f.read(any(ByteBuffer.class))).thenReturn(0).thenReturn(-1);
}
}
