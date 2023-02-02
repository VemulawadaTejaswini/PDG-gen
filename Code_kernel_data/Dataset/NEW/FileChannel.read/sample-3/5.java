//5
public class func{
public void OopTable(String baseDir){
            ByteBuffer bb = ByteBuffer.allocateDirect(64 * 1024).order(ByteOrder.nativeOrder());
            while (fc.read(bb) > 0) {
                bb.flip();
                while (bb.remaining() >= RowEntry.SIZE)
                    list.add(new RowEntry(bb));
                bb.compact();
            }
            fc.close();
}
}
