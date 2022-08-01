//106
public class func{
	public void open(URI address){
        return super.open(new URI(
            getInfo().id(),
            address.getSchemeSpecificPart(),
            address.getFragment()).normalize());
}
}
