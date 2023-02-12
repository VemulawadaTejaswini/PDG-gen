public class func{
public void resolveClass(ObjectStreamClass desc){
        return loader.loadClass(desc.getName());
}
}
