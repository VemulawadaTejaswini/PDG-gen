//155
public class func{
	public void removeResource(String bundleName){
        File bundleFile = new File(this.repoLocation, bundleName);
        this.bundles.remove(bundleFile.toURI().toString());
        bundleFile.delete();
}
}
