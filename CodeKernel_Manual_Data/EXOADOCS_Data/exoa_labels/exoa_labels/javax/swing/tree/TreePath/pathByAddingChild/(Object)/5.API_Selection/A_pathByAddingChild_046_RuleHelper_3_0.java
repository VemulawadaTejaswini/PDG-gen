public class A{
	public static boolean isDescendantTerminalCategoryChecked(TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		if (isDescendantTerminalCategoryChecked(path.pathByAddingChild(obj)))return true;
	}
}