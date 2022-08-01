//3
public class func{
	public void getJSRelativePaths(HashSet<String> fullPaths){
    for (String path : fullPaths) {
      relPath = new File(SessionManager.getInstance().getSourceFolder()).toURI().relativize(new File(path).toURI()).getPath();
      relativePaths.add(relPath);
    }
}
}
