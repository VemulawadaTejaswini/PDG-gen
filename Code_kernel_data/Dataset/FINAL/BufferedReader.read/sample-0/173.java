public class func{
public void read(InputStream in){
        for (int n; (n = reader.read(c)) != -1;) {
            out.append(new String(c, 0, n));
        }
        reader.close();
}
}
