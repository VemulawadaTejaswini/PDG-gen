public class func{
public void test(String s){
        URL url = new URL(s);
        URLConnection conn = url.openConnection();
        if (conn.getLastModified() == 0) {
            System.out.println("Failed: getLastModified returned 0 for URL: " + s);
            testFailed = true;
        }
}
}
