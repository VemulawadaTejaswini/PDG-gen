public class func{
public void readFile(File file,FileUser fileuser){
        while(len!= -1){
            len=channel.read(bytebuffer);
            fileuser.readable(bytebuffer, len);
            bytebuffer=ensureBufferBigEnough(bytebuffer);
        }
}
}
