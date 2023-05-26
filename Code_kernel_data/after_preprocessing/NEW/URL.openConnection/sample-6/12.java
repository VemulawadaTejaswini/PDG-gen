//12
public class func{
public void getResponse(String path){
        URI destUri = getServerURI().resolve(path);
        URL url = destUri.toURL();
        URLConnection conn = url.openConnection();
            in = conn.getInputStream();
            return IO.toString(in);
            IO.close(in);
}
}
