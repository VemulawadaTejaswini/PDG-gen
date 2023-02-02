//4
public class func{
public void main(String[] args){
            ByteBuffer bb = ByteBuffer.allocate(41);
            fc.read(bb);
            bb.flip();
            byte app = bb.get();
            long id = bb.getLong();
            int cxid = bb.getInt();
            long zxid = bb.getLong();
            int len = bb.getInt();
            bb = ByteBuffer.allocate(len);
            fc.read(bb);
            bb.flip();
            if (bb.remaining() > 0) {
                if (type != OpCode.createSession) {
                    int pathLen = bb.getInt();
                    byte b[] = new byte[pathLen];
                    bb.get(b);
                    path = new String(b);
                }
            }
                    DateFormat.LONG).format(new Date(time))
                    + Long.toHexString(id)
                    + op2String(type)
                    + Long.toHexString(zxid)
}
}
