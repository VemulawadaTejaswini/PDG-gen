public class func{
public void read(RandomAccessFile raf,DirectByteBuffer[] buffers,long offset){
      for (int i=0;i<bbs.length;i++){
        ByteBuffer bb = bbs[i] = buffers[i].getBuffer(DirectByteBuffer.SS_FILE);
        int  pos = original_positions[i] = bb.position();
        if ( pos != bb.limit()){
          last_bb  = bbs[i];
        }
      }
      if ( last_bb != null ){
        int    loop      = 0;
        while ( fc.position() < fc.size() && last_bb.hasRemaining()){
          long  read = fc.read( bbs );
          if ( read > 0 ){
            loop  = 0;
          }else{
            loop++;
            if ( loop == READ_RETRY_LIMIT ){
              Debug.out( "FMFile::read: zero length read - abandoning" );
              throw( new FMFileManagerException( "read fails: retry limit exceeded"));
            }else{
              if ( DEBUG_VERBOSE ){
                Debug.out( "FMFile::read: zero length read - retrying" );
              }
              try{
                Thread.sleep( READ_RETRY_DELAY*loop );
              }catch( InterruptedException e ){
                throw( new FMFileManagerException( "read fails: interrupted" ));
              }
            }
          }            
        }
      }
        Debug.out( "Read failed: " + owner.getString() + ": raf open=" + raf.getChannel().isOpen() + ", len=" + raf.length() + ",off=" + offset );
}
}
