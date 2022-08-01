//99
public class func{
	public void createFromSLD(File sld){
            SLDParser stylereader = new SLDParser(styleFactory, sld.toURI().toURL());
            return stylereader.readXML();
}
}
