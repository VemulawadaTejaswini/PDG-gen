//26
public class func{
public void readBuffer(FileChannel chan,ByteBuffer buf,long pos){
        while (buf.hasRemaining()) {
            cpos += chan.read(buf, cpos);
        }
}
}
