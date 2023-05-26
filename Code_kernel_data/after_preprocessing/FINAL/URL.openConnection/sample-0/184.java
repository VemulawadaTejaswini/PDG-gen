public class func{
public void makeHttpCall(){
            URL url = new URL("http" , InetAddress.getLocalHost().getHostAddress(),
                                server.getLocalPort(), "/");
            HttpURLConnection uc = (HttpURLConnection)url.openConnection();
            System.out.println(uc.getResponseCode());
}
}
