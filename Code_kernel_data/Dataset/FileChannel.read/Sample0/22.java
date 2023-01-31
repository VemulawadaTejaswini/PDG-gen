//21
public class func{
	public void read(String name,ByteBuffer dst){
            if (fc.size() > dst.remaining())
                throw new IOException("Stream too large");
            while (dst.hasRemaining()) {
                int n = fc.read(dst);
                if (n < 0)
                    break;
                total += n;
            }
            fc.close();
}
}
