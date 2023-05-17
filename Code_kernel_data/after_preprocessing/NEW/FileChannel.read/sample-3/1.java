//1
public class func{
public void loadDataFromFile(File file){
    FileInputStream fis = new FileInputStream(file);
    FileChannel fc = fis.getChannel();
    ByteBuffer bb = ByteBuffer.allocateDirect((int) fc.size());
    while (bb.remaining() > 0) fc.read(bb);
    fc.close();
}
}
