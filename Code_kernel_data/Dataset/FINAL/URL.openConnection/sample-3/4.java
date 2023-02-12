public class func{
public void outputStreamFromURL(URL url){
        if ("file".equals(url.getProtocol())) {
            String host = url.getHost();
            if (host == null || host.length() == 0) {
                return new FileOutputStream(url.getPath());
            }
        }
        return url.openConnection().getOutputStream();
}
}
