public class func{
public void resourceToFile(String filename){
        ClassLoader loader = FBUtilities.class.getClassLoader();
        URL scpurl = loader.getResource(filename);
        if (scpurl == null)
            throw new ConfigurationException("unable to locate " + filename);
        return new File(scpurl.getFile()).getAbsolutePath();
}
}
