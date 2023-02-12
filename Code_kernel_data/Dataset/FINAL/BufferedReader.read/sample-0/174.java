public class func{
public void newBufferedReader(){
        final CharBuffer buffer = CharBuffer.allocate(contents.length());
        reader.read(buffer);
        reader.close();
}
}
