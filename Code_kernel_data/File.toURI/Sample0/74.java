//73
public class func{
	public void loadEOModel(String path,boolean generateClientClass){
        return loadEOModel(new File(path).toURI().toURL(), generateClientClass);
}
}
