public class func{
public void fileCopy(String xmlpath,String newpath){
                if (inC.position() == inC.size()) {
                    inC.close();
                    outC.close();
                    return true;
                }
                if ((inC.size() - inC.position()) < length) {
                    length = (int) (inC.size() - inC.position());
                }
                b = ByteBuffer.allocateDirect(length);
                inC.read(b);
                b.flip();
                outC.write(b);
                outC.force(false);
}
}
