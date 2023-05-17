//531
public class func{
public void getConnection(URL endpointUrl){
                HttpURLConnection result = (HttpURLConnection) endpointUrl.openConnection();
                return wrapRedirectedHttp(result);
}
}
