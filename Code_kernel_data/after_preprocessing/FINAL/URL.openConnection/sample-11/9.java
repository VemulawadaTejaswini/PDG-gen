public class func{
public void loadVersion(String version){
      conn = (new URL("https://s3.amazonaws.com/Minecraft.Download/versions/" + version + "/" + version + ".json")).openConnection();
      return gson.fromJson(new InputStreamReader(conn.getInputStream()),MinecraftVersion.class);
}
}
