public class func{
public void readData(int column,int row){
            long position = calcFilePosition( column, row );
            FileChannel channel = getReadChannel();
            channel.position( position );
            channel.read( buffer );
}
}
