public class func{
public void copyResourcesRecursively(URL originUrl,File destination){
        URLConnection urlConnection = originUrl.openConnection();
        if (urlConnection instanceof JarURLConnection) {
            copyResourcesFromJar((JarURLConnection) urlConnection, destination);
        } else if (urlConnection instanceof FileURLConnection) {
            if (operatingSystem == OperatingSystem.Mac || operatingSystem == OperatingSystem.Linux) {
                destination = defaultUserConfDir;
            }
            FileUtils.copyDirectoryToDirectory(new File(originUrl.getPath()), destination);
        } else {
            throw new Exception("URLConnection[" + urlConnection.getClass().getSimpleName() +
                    "] is not a recognized/implemented connection type.");
        }
}
}
