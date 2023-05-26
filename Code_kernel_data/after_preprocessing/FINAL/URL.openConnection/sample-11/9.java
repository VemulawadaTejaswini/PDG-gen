public class func{
public void loadVersion(String version){
      conn = (new URL("https:
      return gson.fromJson(new InputStreamReader(conn.getInputStream()),MinecraftVersion.class);
}
}
