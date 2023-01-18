//58
public class func{
	public void providerUsingAnnotatedStereotype(){
        File out = getTemporaryFile("providerUsingAnnotatedStereotype");
        StreamUtils.copyStream(is, new FileOutputStream(out), true);
        return out.toURI().toURL().toExternalForm();
}
}
