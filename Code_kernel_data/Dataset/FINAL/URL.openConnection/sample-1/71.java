public class func{
public void fetchGalaxyData(String galaxyDataUrl){
            URL url = new URL(galaxyDataUrl);
            URLConnection conn = url.openConnection();
            galaxyInput = new String(IOUtils.toCharArray(conn.getInputStream())).trim();
}
}
