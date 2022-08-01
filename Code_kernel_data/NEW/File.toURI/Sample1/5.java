//4
public class func{
	public void loadFromRootUsingSubpathInFilename(){
    final String contents = PathTest.class.getName() + ": loaded from root";
    final File file = createTempFile(contents);
    final File root = findRoot(file);
    final Path path = new Path(root.getCanonicalPath());
    String relative = root.toURI().relativize(file.toURI()).getPath();
    IResourceStream rs = path.find(PathTest.class, relative);
    assertNotNull(rs);
    assertContents(contents, rs);
}
}
