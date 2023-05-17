//6
public class func{
public void getMD5(File file){
            fileInputStream = new FileInputStream(file);
            FileChannel fileChannel = fileInputStream.getChannel();
            while (fileChannel.read(byteBuffer) != -1) {
                byteBuffer.flip();
                m.update(byteBuffer);
                byteBuffer.clear();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
}
}
