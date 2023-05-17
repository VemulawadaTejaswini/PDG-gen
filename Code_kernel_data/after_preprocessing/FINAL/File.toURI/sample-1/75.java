public class func{
public void addClassPathElement(File container){
            classLoader.addResourceStore(new FileResourceStore(container));
            gScripting.getGroovyClassLoader().addURL(container.toURI().toURL());
}
}
