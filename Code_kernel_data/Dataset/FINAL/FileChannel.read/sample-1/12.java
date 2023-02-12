public class func{
public void readV2Tag(File file,int loadOptions){
                bb = ByteBuffer.allocate(startByte);
                fc.read(bb);
                if (fc != null) {
                    fc.close();
                }
                if (fis != null) {
                    fis.close();
                }
}
}
