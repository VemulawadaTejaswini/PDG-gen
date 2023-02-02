//41
public class func{
public void readAsString(InputStream inputStream){
            CharBuffer c = CharBuffer.allocate(BUF_SIZE);
            while (reader.read(c) > -1) {
                c.flip();
                buf.append(c);
                c.clear();
            }
}
}
