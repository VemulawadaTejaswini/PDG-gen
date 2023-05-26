//9
public class func{
public void makeSourceModules(String dir,String name,ClassLoader loader){
    URL script = getURLforFile(dir, name, loader);
        (script.openConnection() instanceof JarURLConnection)? new SourceURLModule(script): makeSourceModule(script, dir, name), 
        getPrologueFile("prologue.js")
}
}
