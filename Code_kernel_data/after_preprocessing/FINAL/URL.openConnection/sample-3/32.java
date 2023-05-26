public class func{
public void openConnection(URL url){
            return MEMORY_URL_PROTOCOL.equals(url.getProtocol()) ? new MemoryURLConnection(url, file) : url.openConnection();
}
}
