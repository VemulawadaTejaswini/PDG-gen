public class func{
public void transferTo(FileChannel fc,long pos,long len){
        if (fileChannelBB == null) {
            fileChannelBB = ByteBuffer.allocate(appBBSize);
            fileChannelBB.limit(0);
        }
        fileChannelBB.compact();
        int fileRead = fc.read(fileChannelBB);
        fileChannelBB.flip();
        doWrite(fileChannelBB);
}
}
