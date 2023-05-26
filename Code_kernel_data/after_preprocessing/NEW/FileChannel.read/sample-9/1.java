//1
public class func{
public void checkVersion(FileChannel channel){
                buffer = ByteBuffer.wrap(new byte[8]);
                channel.read(buffer);
            buffer.position(0);
            long onDiskVersion = buffer.getLong();
}
}
