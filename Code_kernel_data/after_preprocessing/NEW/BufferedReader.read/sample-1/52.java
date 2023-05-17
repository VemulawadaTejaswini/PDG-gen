//52
public class func{
public void getPayloadAsString(final HttpServletRequest request){
    int b = reader.read( buffer );
    while ( b > 0 ) {
      stringBuffer.append( buffer, 0, b );
    }
    return stringBuffer.toString();
}
}
