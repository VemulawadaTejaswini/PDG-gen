//89
public class func{
public void getFilter(String expression,ClassLoader classLoader){
        return new AssignableTypeFilter(classLoader.loadClass(expression));
}
}
