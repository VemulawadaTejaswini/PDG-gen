//48
public class func{
public void getConnection(JarFile jarFile){
        URL u = urlCache.get(jarFile);
        if (u != null)
            return u.openConnection();
}
}
