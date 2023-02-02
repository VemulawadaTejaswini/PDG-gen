//22
public class func{
public void findResource(String name){
        for (ClassLoader loader : loaders) {
            url = loader.getResource(name);
            if (url != null) {
                return url;
            }
        }
}
}
