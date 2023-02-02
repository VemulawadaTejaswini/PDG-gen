//22
public class func{
public void readPropertyIndexStore(){
            buffer.position( 0 );
            fileChannel.read( buffer );
            buffer.flip();
            long inUseByte = buffer.get();
}
}
