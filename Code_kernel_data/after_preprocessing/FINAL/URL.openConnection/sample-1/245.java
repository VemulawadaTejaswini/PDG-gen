public class func{
public void getUrlContentType(String name){
        File            file = new File(System.getProperty("test.src", "."), "xml");
        URL             u = new URL ("file:"
                            + file.getCanonicalPath()
                            + file.separator
                            + name);
        URLConnection   conn = u.openConnection ();
        return conn.getContentType ();
}
}
