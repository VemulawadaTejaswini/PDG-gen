//7
public class func{
	public void BldProject(URI relLoc,Properties overrides){
        loc = new File(".").toURI().resolve(relLoc).normalize();
        config = new BldConfig(loc);
        convert = new BldConverter(config);
        File f = new File(loc);
        lastModified = f.lastModified();
        baseDir = f.getParentFile();
}
}
