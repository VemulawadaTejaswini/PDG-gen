//173
public class func{
public void getUrlInfos(String urlAsString,int timeout){
            URL url = new URL(urlAsString);
            HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            hConn.setRequestProperty("User-Agent", "Mozilla/5.0 Gecko/20100915 Firefox/3.6.10");
            hConn.setConnectTimeout(timeout);
            hConn.setReadTimeout(timeout);
            BufferedInputStream in = new BufferedInputStream(hConn.getInputStream(), arr.length);
            in.read(arr);
            return getUrlInfosFromText(arr);
}
}
