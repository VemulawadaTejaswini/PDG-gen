//30
public class func{
	public void FopConfParser(File fopConfFile,URI defaultBaseURI){
        this(new FileInputStream(fopConfFile), fopConfFile.toURI(),
                EnvironmentalProfileFactory.createDefault(defaultBaseURI,
                        ResourceResolverFactory.createDefaultResourceResolver()));
}
}
