public class A{
	public static boolean hasDescendantNotStockedContent(TreePath path) {
		Object obj = path.getLastPathComponent();
		//...
		if (hasDescendantNotStockedContent(path.pathByAddingChild(obj)))return true;
	}
}