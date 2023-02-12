public class func{
public void getBuildScriptConfig(){
            for (File pathEntry : getPathEntries()) {
                config += String.format("%s.path file('%s')", getId(), pathEntry.toURI());
            }
}
}
