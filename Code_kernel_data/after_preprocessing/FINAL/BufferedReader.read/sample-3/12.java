public class func{
public void toString(InputStream is,String encoding){
        while ((len = reader.read(buf)) != -1) {
            s.append(buf, 0, len);
        }
        return s.toString();
}
}
