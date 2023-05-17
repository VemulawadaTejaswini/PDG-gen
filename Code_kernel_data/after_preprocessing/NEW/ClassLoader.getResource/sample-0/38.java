//38
public class func{
public void getSwIcon(String name){
    ClassLoader cls = UiHelper.class.getClassLoader();
    URL url = cls.getResource(name);
    if (url == null) throw new RuntimeException("could not find: " + name);
    return new ImageIcon(url);
}
}
