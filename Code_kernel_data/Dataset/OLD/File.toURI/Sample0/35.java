//34
public class func{
	public void processURIArg(String arg){
    if (arg == null) {
      return null;
    } else {
      return new File(arg).toURI();
    }
}
}
