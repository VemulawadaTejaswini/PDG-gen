//1
public class func{
public void getWARFile(){
        URL url = ExecutableWARServerLauncherMain.class.getClassLoader().getResource(classResourceName);
        if (url == null)
            throw new IOException("URL for class resource not found: " + classResourceName);
        File warFile = new File(((JarURLConnection) url.openConnection()).getJarFile().getName());
        return warFile.getAbsoluteFile();
}
}
