//124
public class func{
	public void DirectoryClassPathEntry(File dir){
    assert (dir.isAbsolute());
    this.location = dir.toURI().toString();
}
}
