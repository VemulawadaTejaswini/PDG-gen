public class func{
public void doClientSide(){
        URL url = new URL("https:
        HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
        System.out.println("response is " + urlc.getResponseCode());
}
}
