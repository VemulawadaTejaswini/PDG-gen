//13
public class func{
public void addJar(File f){
      if (IJ.debugMode) IJ.log("PluginClassLoader.addJar: "+f);
                addURL(f.toURI().toURL());
}
}
