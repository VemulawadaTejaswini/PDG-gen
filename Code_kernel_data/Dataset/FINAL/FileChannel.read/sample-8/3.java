public class func{
public void read(int columnId,int rowId,ByteBuffer buffer){
        int tileInBlob = tileId % getTilesPerBlob();
                FileChannel channel = getFileChannel();
                channel.position( tileInBlob * getBytesPerTile() );
                channel.read( buffer );
}
}
