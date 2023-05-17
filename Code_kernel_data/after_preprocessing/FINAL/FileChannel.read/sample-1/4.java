public class func{
public void testFileHeaderCorruption(){
                fc.write(ByteBuffer.allocate(256), fc.size() - 256);
            ByteBuffer buff = ByteBuffer.allocate(4 * 1024);
            fc.read(buff, i);
            String h = new String(buff.array(), "UTF-8").trim();
            int idx = h.indexOf("fletcher:");
}
}
