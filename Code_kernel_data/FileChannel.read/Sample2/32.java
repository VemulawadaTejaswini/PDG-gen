//31
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 0, -1);
}
}
