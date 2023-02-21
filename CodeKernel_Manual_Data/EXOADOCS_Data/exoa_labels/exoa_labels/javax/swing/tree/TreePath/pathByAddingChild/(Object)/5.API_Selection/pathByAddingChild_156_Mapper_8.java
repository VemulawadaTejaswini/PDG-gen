public class A{
	private void expandRecursively(TreePath path) {
		getTree().expandPath(path);
		Object node = path.getLastPathComponent();
		for (int i = 0; i < getMapping().getChildCount(node); i++) {
			expandRecursively(path.pathByAddingChild(getMapping().getChild(node, i)));
		}
	}
}