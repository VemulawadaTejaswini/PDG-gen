//64
public class func{
	public void read(FileChannel fileChannel,ByteBuffer buffer,int length){
         int newRead = fileChannel.read(buffer);
         if (newRead < 0) {
            return false;
         }
}
}
