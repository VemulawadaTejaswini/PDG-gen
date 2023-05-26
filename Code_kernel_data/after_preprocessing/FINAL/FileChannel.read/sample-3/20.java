public class func{
public void runTests(){
        while( fc.position() < fc.size() ) {
         fc.read( buffer );
         buffer.flip();
         byte[] raw = new byte[ buffer.limit() ];
         System.arraycopy( buffer.array(), 0, raw, 0, raw.length );
         sha1Gudy.update( buffer );
         sha1Gudy.saveState();
         ByteBuffer bb = ByteBuffer.wrap( new byte[56081] );
         sha1Gudy.digest( bb );
         sha1Gudy.restoreState();
         sha1Sun.update( raw );
         buffer.clear();
        }
}
}
