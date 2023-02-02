//178
public class func{
public void addVersionFile(String pdkDir){
            new File(pdkDir, "../lib");
        URL versionProps = versionProperties.toURI().toURL();
        addURLs(new URL[] {versionProps});
}
}
