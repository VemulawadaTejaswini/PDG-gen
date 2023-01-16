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
