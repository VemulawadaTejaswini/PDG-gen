public class func{
public void readRawBytes(String fileName){
    while ((c = in.read()) >= 0)
      buf.append((char) c);
    mRawBuffer = buf.toString();
}
}
