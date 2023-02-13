public class func{
public void NeoStoreUtil(String storeDir){
            ByteBuffer buf = ByteBuffer.allocate( 4*9 );
            if ( fileChannel.read( buf ) != 4*9 )
            {
                throw new RuntimeException( "Unable to read neo store header information" );
            }
            buf.flip();
            buf.get();
            creationTime = buf.getLong();
            buf.get();
            storeId = buf.getLong();
            buf.get(); 
            version = buf.getLong();
            buf.get();
            txId = buf.getLong();
}
}
