//56
public class func{
	public void getURIValue(URI base){
            if (base == null) return uriFrag;
            URI relBase = new URI(null, base.getSchemeSpecificPart(), null);
            if (relBase.isOpaque())
            {
                relUri = new URI(null, base.getSchemeSpecificPart(), uriFrag.getFragment());
            }
            else
            {
                relUri = relBase.resolve(uriFrag);
            }
            return new URI(base.getScheme() + ":" + relUri);
}
}
