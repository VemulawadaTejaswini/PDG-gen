//20
public class func{
public void handleMethodGET(URI uri,HTTPRequest request,ToadletContext ctx){
    Runtime rt = Runtime.getRuntime();
    long freeMemory = rt.freeMemory();
    long totalMemory = rt.totalMemory();
    long maxMemory = rt.maxMemory();
    int availableCpus = rt.availableProcessors();
}
}
