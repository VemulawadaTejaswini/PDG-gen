public class Dummy {
    public static final String DEFAULT_URL = "http:
    private static char[] URL;
    private static char[] url;
    public static void main(String [] args) throws MalformedURLException {
        go2();
        go3();
        go();
    }
    private static void go2(){
        URL = DEFAULT_URL.toCharArray();
    }
    private static void go3(){
        url = URL;
    }
    private static void go() throws MalformedURLException {
        System.out.println(new URL(url.toString()));
    }
}
