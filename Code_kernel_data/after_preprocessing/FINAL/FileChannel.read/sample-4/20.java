public class func{
public void getBytesFromFile(File file){
            is = new FileInputStream(file);
            FileChannel in = is.getChannel();
            in.read(byteBuffer);
            byteBuffer.flip();
}
}
