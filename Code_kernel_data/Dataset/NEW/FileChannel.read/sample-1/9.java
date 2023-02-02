//9
public class func{
public void readBackendInfo(File file){
        if ( !file.exists() || ( file.length() == 0 ) ) {
            return new ModelBackendInfo();
        }
        RandomAccessFile raf = new RandomAccessFile( file, "r" );
        FileChannel channel = raf.getChannel();
        ByteBuffer bb = ByteBuffer.allocate( (int) raf.length() );
        channel.read( bb );
        channel.close();
}
}
