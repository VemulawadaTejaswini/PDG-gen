public class func{
public void inputStreamToString(InputStream is){
            int n = br.read(c, 0, c.length);
            if (n < 0) break;
            sw.write(c, 0, n);
        isr.close();
}
}
