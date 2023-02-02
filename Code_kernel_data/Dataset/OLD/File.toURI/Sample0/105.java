//104
public class func{
	public void apply(final String str){
          File _file = new File(str);
          java.net.URI _uRI = _file.toURI();
          return _uRI.toURL();
}
}
