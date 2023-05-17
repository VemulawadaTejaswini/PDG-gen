//5
public class func{
public void readAllFromFile(long from,long to,Envelope datasetEnvelope,ICRS baseCRS){
            ByteBuffer objectBuffer = ByteBuffer.allocate( (int) ( to - from ) );
            channel.position( from );
            channel.read( objectBuffer );
}
}
