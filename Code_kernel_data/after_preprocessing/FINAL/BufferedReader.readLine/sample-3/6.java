public class func{
public void readInputStream(InputStream in){
        while ((s = reader.readLine()) != null) {
            buf.append(s);
        }
        return buf.toString();
}
}
