public class func{
public void seek(final File seekFile,long startByte){
        fc.position(startByte);
        fc.read(bb, startByte);
        bb.flip();
}
}
