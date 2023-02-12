public class func{
public void getResource(String path){
            URL url = getClass().getResource(fullPath);
            if (url == null) {
                System.out.println("url is null: " + fullPath);
            }
            return new URLResource(url, url.openConnection(), path);
}
}
