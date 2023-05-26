//55
public class func{
public void load(CustomTagLibrary taglib,String name,ClassLoader classLoader){
        URL res = classLoader.getResource(taglib.basePath + '/' + name + ".groovy");
        if(res==null)   return null;
}
}
