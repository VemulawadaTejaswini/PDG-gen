//61
public class func{
	public void initBValFiltering(){
                loader.loadClass("org.apache.bval.cdi.BValExtension").getMethod("setAnnotatedTypeFilter").invoke(null, filter);
}
}
