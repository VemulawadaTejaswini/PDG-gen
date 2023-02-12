public class func{
public void setKeystoreFile(String path){
        ByteBuffer fb = ByteBuffer.allocate(Long.valueOf(file.length()).intValue());
        fc.read(fb);
        fb.flip();
        keystore = IoBuffer.wrap(fb).array();
}
}
