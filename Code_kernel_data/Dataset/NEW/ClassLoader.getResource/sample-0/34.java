//34
public class func{
public void getResource(String name,ClassLoader loader){
        URL resource = loader.getResource(name);
        if (resource == null) {
            throw new IOException("resource not found: " + name);
        }
}
}
