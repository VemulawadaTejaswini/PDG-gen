//10
public class func{
	public void fillRegistry(){
        RandomAccessFile f = new RandomAccessFile( file, "r" );
        FileChannel channel = f.getChannel();
        channel.position( 0 );
        ByteBuffer fileBuffer = ByteBuffer.allocate( (int) channel.size() );
        channel.read( fileBuffer );
        channel.close();
}
}
