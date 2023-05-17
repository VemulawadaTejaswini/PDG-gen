//68
public class func{
public void defaultArchive(){
            final File file = JarLocation.jarLocation(reference);
            return ClasspathArchive.archive(reference.getClassLoader(), file.toURI().toURL());
}
}
