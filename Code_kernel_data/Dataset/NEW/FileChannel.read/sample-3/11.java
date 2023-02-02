//11
public class func{
public void fullRead(FileChannel fc,ByteBuffer bb){
        while(bb.remaining() > 0) {
            int rc = fc.read(bb);
            if (rc <= 0) {
                return total;
            }
            total += rc;
        }
}
}
