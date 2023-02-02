//266
public class func{
public void main(String[] args){
        URL url = new URL("http://localhost:" + port);
        URLConnection conURL =  url.openConnection();
        conURL.setDoInput(true);
        conURL.setAllowUserInteraction(false);
        conURL.setUseCaches(false);
}
}
