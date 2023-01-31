//18
public class func{
	public void toFileUrls(final List<String> thirdPartyJars){
        for (String path : thirdPartyJars) {
            thirdPartyClassPath.add(new File(path).toURI().toURL());
        }
}
}
