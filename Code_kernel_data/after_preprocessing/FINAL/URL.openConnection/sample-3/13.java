public class func{
public void getResourceAsStream(String name){
        URL url = getResource(name);
        if (url != null) {
            try {
                URLConnection con = url.openConnection();
                con.setUseCaches(false);
                return con.getInputStream();
            } catch (IOException e) {
            }
        }
}
}
