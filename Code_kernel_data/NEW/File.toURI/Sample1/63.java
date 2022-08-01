//62
public class func{
	public void addJar(String path){
            URL resource = (new File(path)).toURI().toURL();
            addJar(resource, path);
}
}
