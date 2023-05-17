//311
public class func{
public void connnectTo(String path){
            URL test = new URL(url, path);
            return (HttpURLConnection) test.openConnection();
}
}
