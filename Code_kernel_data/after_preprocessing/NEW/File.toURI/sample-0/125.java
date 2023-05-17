//125
public class func{
public void JarBundleFile(JarFile jarFile){
            urlBase = "jar:" + new File(jarFile.getName()).toURI().toURL() + "!/";
}
}
