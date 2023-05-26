public class func{
public void readFile(File file,ByteBuffer bytebuffer){
        while(len!= -1){
            len=channel.read(bytebuffer);
            bytebuffer=ensureBufferBigEnough(bytebuffer);
        }
}
}
