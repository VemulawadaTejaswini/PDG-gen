//151
public class func{
public void getReaderAsString(Reader reader){
    BufferedReader in = new BufferedReader(reader);
    while ((n = in.read(buf)) > 0) {
      sw.write(buf, 0, n);
    }
    return sw.toString();
}
}
