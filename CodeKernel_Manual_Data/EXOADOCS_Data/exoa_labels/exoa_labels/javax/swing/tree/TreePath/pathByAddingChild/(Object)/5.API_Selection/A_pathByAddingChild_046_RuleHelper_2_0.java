public class A{
	public static boolean isDescendantChecked(TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		if (isDescendantChecked(path.pathByAddingChild(obj)))return true;
	}
}