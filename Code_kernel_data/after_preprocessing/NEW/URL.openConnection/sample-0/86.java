//86
public class func{
public void download(String urlAsString){
            URL url = new URL(urlAsString);
            HttpURLConnection hConn = (HttpURLConnection) url.openConnection(Proxy.NO_PROXY);
            hConn.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux i686; rv:7.0.1) Gecko/20100101 Firefox/7.0.1");
            hConn.addRequestProperty("Referer", "http://jetsli.de/crawler");
            hConn.setConnectTimeout(2000);
            hConn.setReadTimeout(2000);
            InputStream is = hConn.getInputStream();
            if ("gzip".equals(hConn.getContentEncoding()))
                is = new GZIPInputStream(is);
            return getInputStream(is);
}
}
