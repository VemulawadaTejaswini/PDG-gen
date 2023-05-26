//9
public class func{
public void getResource(final String name){
    final File f = new File(this.root, name);
    if (f.canRead()) {
      // magically work around encoding issues
      return f.toURI().toURL();
    } else {
      return null;
    }
}
}
