public class A{
	public static boolean hasDescendantContent(TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		if (hasDescendantContent(path.pathByAddingChild(obj)))return true;
	}
}