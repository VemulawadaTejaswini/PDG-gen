//27
public class func{
public void decodeSmallFile(FileChannel channel,int lsize,String charSet){
    ByteBuffer byteBuffer = ByteBuffer.allocate(lsize);
    channel.read(byteBuffer);
    byteBuffer.flip();
    skipUTF8ByteOrderMark(byteBuffer, charSet);
    CharBuffer charBuffer = Charset.forName(charSet).decode(byteBuffer);
    char[] buf= extractChars(charBuffer);
    return new CharArray(buf);
}
}
