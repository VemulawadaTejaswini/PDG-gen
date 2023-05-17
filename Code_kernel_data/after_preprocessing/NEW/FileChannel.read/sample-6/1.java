//1
public class func{
public void writeLastUpdated(File touchfile,String key,String error){
                    ByteBuffer buffer = ByteBuffer.allocate( (int) channel.size() );
                    channel.read( buffer );
                    buffer.flip();
                    ByteArrayInputStream stream = new ByteArrayInputStream( buffer.array() );
                    props.load( stream );
}
}
