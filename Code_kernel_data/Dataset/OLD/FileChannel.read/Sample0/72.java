//71
public class func{
	public void readFailure(File failureFile){
            FileChannel channel = rwFile.getChannel();
            byte[] data = new byte[(int) channel.size()];
            int readData = channel.read( ByteBuffer.wrap( data ) );
            channel.close();
            return readData <= 0 ? "" : new String( withoutZeros( data ), "utf-8" );
}
}
