public class func{
public void load(ClassLoader classLoader){
            if (type != null) {
                return type;
            }
            return classLoader.loadClass(typeName);
}
}
