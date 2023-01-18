//30
public class func{
	public void doTestForIOOBException(FileChannel channel,ByteBuffer[] buffer){
            channel.read(buffer, 1, 2);
}
}
