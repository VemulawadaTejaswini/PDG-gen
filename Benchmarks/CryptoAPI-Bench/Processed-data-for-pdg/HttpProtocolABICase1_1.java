public class Dummy {
    public static void main(String [] args) throws MalformedURLException {
        String url = "http:
        go(url);
    }
    private static void go(String url) throws MalformedURLException {
        System.out.println(new URL(url));
    }
}
