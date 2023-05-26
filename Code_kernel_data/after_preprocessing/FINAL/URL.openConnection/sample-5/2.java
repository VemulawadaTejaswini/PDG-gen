public class func{
public void getSensorDetails(URL target,String url){
        HttpsURLConnection c = (HttpsURLConnection) target.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                c.getInputStream()));
}
}
