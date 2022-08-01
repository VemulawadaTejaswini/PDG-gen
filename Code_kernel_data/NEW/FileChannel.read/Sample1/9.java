//8
public class func{
	public void NeoStoreUtil(String storeDir){
            ByteBuffer buf = ByteBuffer.allocate( 4*9 );
            if ( fileChannel.read( buf ) != 4*9 )
            {
                throw new RuntimeException( "Unable to read neo store header information" );
            }
            buf.flip();
            buf.get(); // in use byte
            creationTime = buf.getLong();
            buf.get(); // in use byte
            storeId = buf.getLong();
            buf.get(); 
            version = buf.getLong(); // skip log version
            buf.get(); // in use byte
            txId = buf.getLong();
}
}
