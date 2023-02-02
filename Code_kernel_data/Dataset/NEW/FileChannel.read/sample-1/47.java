//47
public class func{
public void testFileSystem(){
            ByteBuffer data = ByteBuffer.allocate(1024);
            fc.read(data, 0);
            data.flip();
            int got = data.get();
}
}
