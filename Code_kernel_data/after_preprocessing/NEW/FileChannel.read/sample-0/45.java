//45
public class func{
public void get(String fn){
            bb.clear();
            if (fc.read(bb) < 0)
                throw new IOException("Could not read any bytes");
            bb.flip();
            int major = bb.getShort(6);
}
}
