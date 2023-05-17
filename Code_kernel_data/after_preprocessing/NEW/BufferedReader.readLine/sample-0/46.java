//46
public class func{
public void getPortFromShutdownPortFile(String portFile){
        BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(portFile)));
        String portStr = r.readLine();
        port = Integer.parseInt(portStr);
        r.close();
}
}
