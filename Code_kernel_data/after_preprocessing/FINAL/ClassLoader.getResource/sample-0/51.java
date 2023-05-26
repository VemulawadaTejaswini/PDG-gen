public class func{
public void findResource(final String name){
    ClassLoader _classLoader = this.classFinder.getClassLoader();
    final URL result = _classLoader.getResource(name);
    if (result != null) {
      _elvis = result;
    } else {
      URL _findResource = super.findResource(name);
      _elvis = _findResource;
    }
}
}
