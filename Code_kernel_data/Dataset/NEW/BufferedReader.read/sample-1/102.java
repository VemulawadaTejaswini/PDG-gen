//102
public class func{
public void parse(InputStream in){
        while ((len = reader.read(mReadBuf)) != -1) {
            mStringBuf.append(mReadBuf, 0, len);
        }
}
}
