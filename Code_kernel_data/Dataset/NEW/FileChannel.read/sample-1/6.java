//6
public class func{
public void main(String[] args){
    ByteBuffer buff = ByteBuffer.allocate( 32*1024 );
    while ( in.read( buff ) > 0 ) {
      buff.flip();
      out.write( buff );
      buff.clear();
    }
    in.close();
}
}
