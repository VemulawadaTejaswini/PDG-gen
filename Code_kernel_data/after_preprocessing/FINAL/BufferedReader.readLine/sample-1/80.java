public class func{
public void getPluginPaths(BufferedReader reader){
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("#")) {
                continue;
            }
            pluginPaths.add(line);
        }
}
}
