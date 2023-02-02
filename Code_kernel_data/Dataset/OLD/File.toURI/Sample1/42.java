//41
public class func{
	public void FopConfParser(File fopConfFile,ResourceResolver resourceResolver){
        this(new FileInputStream(fopConfFile), fopConfFile.toURI(), resourceResolver);
}
}
