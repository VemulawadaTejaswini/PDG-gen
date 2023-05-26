public class func{
public void decode(FileChannel channel,long fileOffset,long fileEndOffset,CharBuffer dest){
    channel.position(fileOffset);
    channel.read(in);
    in.flip();
}
}
