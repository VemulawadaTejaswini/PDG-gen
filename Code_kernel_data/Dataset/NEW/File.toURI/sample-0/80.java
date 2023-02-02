//80
public class func{
public void getClassLoader(JavaArchive jar){
        jar.as(ExplodedExporter.class).exportExploded(tmp, "root");
        URL url = new File(tmp, "root").toURI().toURL();
        return new URLClassLoader(new URL[]{url});
}
}
