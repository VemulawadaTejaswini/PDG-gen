public class func{
public void rebuildIdGenerator(){
                for ( long i = 0; i * recordSize < fileSize && recordSize > 0; 
                    i++ )
                {
                    fileChannel.position( i * recordSize );
                    fileChannel.read( byteBuffer );
                    byteBuffer.flip();
                    byte inUse = byteBuffer.get();
                    byteBuffer.flip();
                    nextId();
                    if ( (inUse & 0x1) == Record.NOT_IN_USE.byteValue() )
                    {
                        freeIdList.add( i );
                    }
                    else
                    {
                        highId = i;
                        while ( !freeIdList.isEmpty() )
                        {
                            freeId( freeIdList.removeFirst() );
                            defraggedCount++;
                        }
                    }
                }
}
}
